package org.billingapplication.model;
public class BillModel {
	
	private int oNo;
	private String oName;
	private int quentity;
	private int oPrice;
	private float total;
	
	public BillModel()
	{
		
	}
	public BillModel(int oNo,String oName,int quentity,int oPrice)
	{
		this.oNo=oNo;
		this.oName=oName;
		this.quentity=quentity;
		this.oPrice=oPrice;
	}
	
	public int getoNo() {
		return oNo;
	}
	public void setoNo(int oNo) {
		this.oNo = oNo;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public int getQuentity() {
		return quentity;
	}
	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}
	public int getoPrice() {
		return oPrice;
	}
	public void setoPrice(int oPrice) {
		this.oPrice = oPrice;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
}
