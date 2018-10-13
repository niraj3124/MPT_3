package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="getAllRecharge",query="select r from Recharge r")
public class Recharge {
	
	@Id
	@GeneratedValue
	private int rechargeId;
	private String planName;
	private int amount;
	private String mobileNo;
	private String description;
	private String dateOfRecharge;
	public int getRechargeId() {
		return rechargeId;
	}
	public void setRechargeId(int rechargeId) {
		this.rechargeId = rechargeId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateOfRecharge() {
		return dateOfRecharge;
	}
	public void setDateOfRecharge(String dateOfRecharge) {
		this.dateOfRecharge = dateOfRecharge;
	}
	public Recharge(int rechargeId, String planName, int amount,
			String mobileNo, String description, String dateOfRecharge) {
		super();
		this.rechargeId = rechargeId;
		this.planName = planName;
		this.amount = amount;
		this.mobileNo = mobileNo;
		this.description = description;
		this.dateOfRecharge = dateOfRecharge;
	}
	public Recharge(String planName, int amount, String mobileNo,
			String description, String dateOfRecharge) {
		super();
		this.planName = planName;
		this.amount = amount;
		this.mobileNo = mobileNo;
		this.description = description;
		this.dateOfRecharge = dateOfRecharge;
	}
	
	public Recharge() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Recharge [rechargeId=" + rechargeId + ", planName=" + planName
				+ ", amount=" + amount + ", mobileNo=" + mobileNo
				+ ", description=" + description + ", dateOfRecharge="
				+ dateOfRecharge + "]";
	}
	
	

}
