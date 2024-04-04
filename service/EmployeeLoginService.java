package org.billingapplication.service;
import java.util.*;
import org.billingapplication.repository.EmployeeLoginRepository;

public class EmployeeLoginService {
	EmployeeLoginRepository ELR=new EmployeeLoginRepository();
	
	public void setEmployee(int id, String pass) {
		ELR.setEmployeeLogin(id,pass);
	}
	public LinkedHashMap<Integer, String> getEmployeeLogin() {
		
		return ELR.getEmployeeLogin();
	}
	
}
