package org.billingapplication.service;
import java.util.*;

import org.billingapplication.model.OrderModel;
import org.billingapplication.repository.BillRepo;

public class BillService {
	BillRepo bRepo= new BillRepo();
	
	public void setAllBillDetial(String cName, ArrayList<OrderModel> al) {
		// TODO Auto-generated method stub
		bRepo.setAllBillDetial(cName,al);
	}
	
	
	public LinkedHashMap<String, ArrayList<OrderModel>> getBillTotal() {
		// TODO Auto-generated method stub
		return bRepo.getBillTotal();
	}
}
