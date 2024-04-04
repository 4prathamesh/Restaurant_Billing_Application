package org.billingapplication.repository;
import java.util.*;
import org.billingapplication.model.MenuModel;
public class MenuRepo {
	static LinkedHashMap<Integer,MenuModel> mapM= new LinkedHashMap<Integer,MenuModel>();

	public int getSizeOfMenu()
	{
		return mapM.size();
	}
	public void setMenu(int mid,MenuModel mm)
	{
		mapM.put(mid, mm);
	}
	public LinkedHashMap<Integer, MenuModel> getMenuList() {
		// TODO Auto-generated method stub
		return mapM;
	}
}
