package org.billingapplication.service;
import java.util.LinkedHashMap;

import org.billingapplication.model.MenuModel;
import org.billingapplication.repository.MenuRepo;

public class MenuService {
	MenuRepo mRepo= new MenuRepo();
	public void setMenu(MenuModel menuModel) {
		// TODO Auto-generated method stub
		int size=mRepo.getSizeOfMenu();
		size++;
		mRepo.setMenu(size,menuModel);
	}
	public LinkedHashMap<Integer, MenuModel> getMenuList() {
		// TODO Auto-generated method stub
		return mRepo.getMenuList();
	}

}
