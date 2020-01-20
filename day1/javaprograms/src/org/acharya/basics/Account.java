package org.acharya.basics;
import java.util.*;
public class Account {
	private String name;
	private String email;
	private long mobile;
	private String addrproof;
	private float balance;
	private int acctNo;
	private long aadhar;
	public int getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	/**
	public int openAccount(String name,String email,long mobile,String addrproof)
	{
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.addrproof = addrproof;
		int acctNo = (int) (Math.random()*10000);
		this.acctNo = acctNo;
		return acctNo;
	} */
	
	public Account(String name,String email,long mobile,String addrproof)
	{
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.addrproof = addrproof;
		int acctNo = (int) (Math.random()*10000);
		this.acctNo = acctNo;
		//return acctNo;
	}
	
	public Account(String name,String email,long mobile,String addrproof,long aadhar)
	{
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.addrproof = addrproof;
		int acctNo = (int) (Math.random()*10000);
		this.acctNo = acctNo;
		this.aadhar = aadhar;
		//return acctNo;
	}
	public float deposit(int acctno,float amt) {
		this.balance = this.balance + amt;
		return this.balance;
	}
	
	public float withdraw(int acctno,float amt) {
		
		if(amt > this.balance) {
			System.out.println("You do not have enough balance");
		}else
		{
			this.balance = this.balance - amt;
		}
		return this.balance;
	}
	
	public float checkBalance(int acctno) {
		
		return this.balance;
	}
}
