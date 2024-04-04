package org.billingapplication.repository;
import java.util.*;

import org.billingapplication.model.EmployeeloginModel;
import org.billingapplication.model.MenuModel;
public class EmployeeLoginRepository {
	static LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
	
	public void setEmployeeLogin(int id, String pass) {
		// TODO Auto-generated method stub
		map.put(id, pass);
		
	}
	
	// return employee login LinkedHashMap
	public LinkedHashMap<Integer, String> getEmployeeLogin() {
		return map;
	}
}
