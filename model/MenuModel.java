package org.billingapplication.model;

public class MenuModel {
	private String mName;
	private int mPrice;
	private boolean mStatus;
	
	public MenuModel()
	{
	
	}
	public MenuModel(String mName,int mPrice,boolean mStatus)
	{
		this.mName=mName;
		this.mPrice=mPrice;
		this.mStatus=mStatus;
	}
	
	public boolean ismStatus() {
		return mStatus;
	}
	public void setmStatus(boolean mStatus) {
		this.mStatus = mStatus;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public int getmPrice() {
		return mPrice;
	}
	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}
}
