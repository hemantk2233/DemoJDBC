package com.capgemini.paymentwallet.dao;


import java.util.List;

import com.capgemini.paymentwallet.bean.CustomerDetails;
import com.capgemini.paymentwallet.bean.AccountDetails;

public interface IWalletAppDAO {
	

	public float showBalance();
	public boolean depositAmount(float amount);
	public boolean withdrawAmount(float amount);
	public boolean loginAccount(String uName,String uPassword);
	public boolean fundTransfer(int accNo,float amount);
	public List<String> printTransaction();
	public boolean addWalletDetails(AccountDetails wallet);
	public boolean checkUserName(String uName);
}
