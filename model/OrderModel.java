package org.billingapplication.model;

public class OrderModel {
	private String oName;
	private int noOfOrder;
	private int oid;
	
	public OrderModel()
	{
	
	}
	public OrderModel(String oName,int noOfOrder,int oid)
	{
		this.oName=oName;
		this.noOfOrder=noOfOrder;
		this.oid=oid;
	}
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public int getNoOfOrder() {
		return noOfOrder;
	}
	public void setNoOfOrder(int noOfOrder) {
		this.noOfOrder = noOfOrder;
	}
	
}
