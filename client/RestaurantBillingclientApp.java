package org.billingapplication.client;

import java.util.*;
import org.billingapplication.model.BillModel;
import org.billingapplication.model.EmployeeloginModel;
import org.billingapplication.model.MenuModel;
import org.billingapplication.model.OrderModel;
import org.billingapplication.service.BillService;
import org.billingapplication.service.EmployeeLoginService;
import org.billingapplication.service.MenuService;
	
public class RestaurantBillingclientApp {
	public static void main(String x[]) {
		EmployeeloginModel ELM = new EmployeeloginModel();
		EmployeeLoginService ELS = new EmployeeLoginService();
		BillService billS = new BillService();
		MenuService menuS = new MenuService();
		BillModel bModel = new BillModel();
		OrderModel orderM;
		MenuModel menuModel;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆");
			System.out.println("😊\t\t\t1. Open Application by Employee\t\t\t😊");
			System.out.println("😊\t\t\t2. Menu List for client 😋\t\t\t😊");
			System.out.println("😊\t\t\t3. Order Food 🤩\t\t\t\t\t😊");
			System.out.println("😊\t\t\t4. Bill 💵💵\t\t\t\t\t😊");
			System.out.println("😊\t\t\t5. see all bill list (❁´◡`❁)\t\t\t😊");
			System.out.println("😊\t\t\t6. 🤗🤗Exit🤗🤗\t\t\t\t\t😊");
			System.out.println("🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆\n");
			System.out.println("Choice any one");
			int choice = sc.nextInt();
			sc.nextLine();
			boolean flag = false;
			switch (choice) {
			case 1:
				do {
					System.out.println("🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆");
					System.out.println("😊\t\t\t1. Employee Sign-in\t\t\t\t😊");
					System.out.println("😊\t\t\t2. Employee Login 😋\t\t\t\t😊");
					System.out.println("😊\t\t\t3. Update menu List 😋\t\t\t\t😊");
					System.out.println("😊\t\t\t4. Exit from Login page 🤩\t\t\t😊");
					System.out.println("🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆\n");
					System.out.println("Choice any one");
					choice = sc.nextInt();
					sc.nextLine();
					switch (choice) {
					case 1: // sign in Start
						System.out.println("Enter the employee id for Sign-in ✍️");
						int id = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter the PassWord");
						String pass = sc.nextLine();
						ELM.setId(id);
						ELM.setPass(pass);
						ELS.setEmployee(ELM.getId(), ELM.getPass());
						break; // sign in END
					case 2: // Login Start
						LinkedHashMap<Integer,String> map = ELS.getEmployeeLogin();
						Set<Map.Entry<Integer,String>> smap = map.entrySet();
						if (map.size() >0) {
							boolean lflag = false;
							// employee login
							for (Map.Entry<Integer, String> m : smap) {
														
								System.out.println("Enter the employee id for Login");
								id = sc.nextInt();
								sc.nextLine();
								System.out.println("Enter the PassWord for Login");
								pass = sc.nextLine();
								if (m.getKey() == id && m.getValue().equals(pass)) {
									System.out.println("😍😍Login Successful😍😍");
									lflag = true;
									break;
								} else {
									System.out.println("😒😒 Id or Pass is Invalid 😒😒");
								}
							} // login end
							if (lflag) {
								menuS.setMenu(new MenuModel("Dal Makhani", 192 ,true));
								menuS.setMenu(new MenuModel("Tanduri Roti", 30,true));
								menuS.setMenu(new MenuModel("Roti", 20,true));
								menuS.setMenu(new MenuModel("Paneer Sabji", 200,true));
								menuS.setMenu(new MenuModel("Paneer tikka", 250,true));
								menuS.setMenu(new MenuModel("Alu Sabji", 150,true));
							}

						} 
						else {
							System.out.println("Employee is not present 🙏 Sign-in \n");
						}
						break; // login END
						
					case 3:
						LinkedHashMap<Integer, MenuModel> mapM = menuS.getMenuList();

						if (mapM.size() > 0) {
							
							System.out.println("enter the Menu name for update");
							String mName=sc.nextLine();
							
							Set<Map.Entry<Integer, MenuModel>> sMl = mapM.entrySet();
							boolean cflag=true;
							for (Map.Entry<Integer, MenuModel> m : sMl) {
								menuModel = m.getValue();
								if( mName.equalsIgnoreCase(menuModel.getmName()) )
								{
									cflag=false;
									System.out.println(mName+" is Available(1) or not(0)");
									int check=sc.nextInt();
									sc.nextLine();
									if(check==1)
									{
										menuModel.setmStatus(true);
										System.out.println("Menu update successfully Now "+mName+" is Available");
									}
									if(check==0)
									{
										menuModel.setmStatus(false);
										System.out.println("Menu update successfully Now "+mName+" is Not Available");
									}
								}
							}
							if(cflag)
							{
									System.out.println("Food is not Available 😒");
							}
							System.out.println();
						} else {
							System.out.println("😁😁 Employee Login is must 😁😁");
						}
						break;

					default:
						flag = true;
						System.out.println("Exit form Employee sevice ");
						break;
					}

					// for exit the loop
					if (flag) {
						flag = false; // becose out of this switch there are one more flag is present
						break;
					}
				} while (true);

				break;
			// Employee sevice case ------2---- END
			case 2:
//				Menu List
				LinkedHashMap<Integer, MenuModel> mapM = menuS.getMenuList();

				if (mapM.size() > 0) {
					Set<Map.Entry<Integer, MenuModel>> sMl = mapM.entrySet();
					System.out.println("No\tName\t\tPrice");
					for (Map.Entry<Integer, MenuModel> m : sMl) {
						menuModel = m.getValue();
						System.out.println(m.getKey() + "\t" + menuModel.getmName() + "\t" + menuModel.getmPrice());
					}
					System.out.println();
				} else {
					System.out.println("😁😁 Employee Login is must 😁😁");
				}
				break;
			case 3: // order Menu Start
				int c;
				System.out.println("Enter the Customer Name");
				String cName = sc.nextLine();
				ArrayList<OrderModel> al2= new ArrayList<OrderModel>();
				int i=0;
				do {
					System.out.println("enter the Name of Food 🥗🥗");
					String str = sc.nextLine();
					System.out.println("enter the quantity of Food 🤞");
					int nFood = sc.nextInt();
					sc.nextLine();
					LinkedHashMap<Integer, MenuModel> mapM1 = menuS.getMenuList(); // take menu list for check the food is present or not
					Set<Map.Entry<Integer, MenuModel>> sMl = mapM1.entrySet();
					flag = false;
					for (Map.Entry<Integer, MenuModel> m : sMl) {
						menuModel = m.getValue();
						if (menuModel.getmName().equalsIgnoreCase(str) && menuModel.ismStatus()==true ) {
							flag = true;
							break;
						}
					}
					if (flag) {
						
						i++;
						orderM = new OrderModel(str, nFood,i);

						
						al2.add(orderM);
						//orderS.setOrder(orderM);
						System.out.println("🤗 Your one Food is Add 🤗");
						flag = false;
					} else {
						System.out.println("😒 Food is Not Avalable 😒");
					}

					System.out.println("Any More Order Yes(1) and No(0) 😍");
					c = sc.nextInt();
					sc.nextLine();

						if(c==0)
						{ 
							billS.setAllBillDetial(cName,al2);
						}
				} while (c == 1);

				break; // order menu END
			case 4: // Bill start
				LinkedHashMap<String, ArrayList<OrderModel>> blhm = billS.getBillTotal();

				int oprice = 1;
				int total = 0;
				String cname;

				System.out.println("enter the customer ");
				cname = sc.nextLine();
				Set<Map.Entry<String, ArrayList<OrderModel>>> smap = blhm.entrySet();
				for (Map.Entry<String, ArrayList<OrderModel>> sm : smap) {
					
					if (sm.getKey().equalsIgnoreCase(cname)) {
						System.out.println("\nCustomer name: " + sm.getKey());
						cname = sm.getKey();
						System.out.println("🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆🔆");
						System.out.println("\tNo\tName\t\tQuantity\t\tprice");
						ArrayList<OrderModel> li = sm.getValue();
						
						Iterator<OrderModel> it=li.iterator();
						while(it.hasNext())
						{
							orderM=it.next();
							// we are take price from menu-service
							mapM = menuS.getMenuList();
							Set<Map.Entry<Integer, MenuModel>> menuM = mapM.entrySet();
							for (Map.Entry<Integer, MenuModel> subm : menuM) {
								menuModel = subm.getValue();
								if (menuModel.getmName().equalsIgnoreCase(orderM.getoName())) // compare food name
								{
									oprice = menuModel.getmPrice();
									break;
								}
							}
							System.out.println("\t"+orderM.getOid() + "\t" + orderM.getoName() + "\t\t" + orderM.getNoOfOrder() + "\t\t"
									+ orderM.getNoOfOrder() * oprice);
							total = total + orderM.getNoOfOrder() * oprice;
						}
						
						
						System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
						System.out.println("\tTotal 🟰 " + total+"\n 😊😊😊😊\n");
					}
					
				}
				break; // End Bill
			case 5:
				blhm = billS.getBillTotal();
				smap = blhm.entrySet();
				for(Map.Entry<String, ArrayList<OrderModel>> sm : smap)
				{
					String pra=sm.getKey();
					ArrayList<OrderModel> al1=sm.getValue();
					System.out.println("\nCustomer Name "+pra);
					System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
					Iterator<OrderModel> it = al1.iterator();
					while(it.hasNext())
					{
						OrderModel ob=it.next();
						System.out.println(ob.getOid()+"\t"+ob.getoName()+"\t"+ob.getNoOfOrder());
					}
					System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
				}
				break;

			case 6:
				System.out.println("Exit!!!");
				flag = true;
				break;
			}

			if (flag) {
				break;
			}
		} while (true);

	}
}
