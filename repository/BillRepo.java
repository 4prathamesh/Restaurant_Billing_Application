package org.billingapplication.repository;

import org.billingapplication.model.OrderModel;
import java.util.*;
public class BillRepo {
//	static LinkedHashMap<Integer,OrderModel> ordmap= new LinkedHashMap<Integer,OrderModel>();
	LinkedHashMap<String,ArrayList<OrderModel>> billMap= new LinkedHashMap<String,ArrayList<OrderModel>>();
	
	public void setAllBillDetial(String cName,ArrayList<OrderModel> al) {
		// TODO Auto-generated method stub
		//System.out.println("size of list "+al.size());
		billMap.put(cName, al);
	}
	public LinkedHashMap<String, ArrayList<OrderModel>> getBillTotal() {
		// TODO Auto-generated method stub
		return billMap;
	}
}
