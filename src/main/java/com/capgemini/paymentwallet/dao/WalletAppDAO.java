package com.capgemini.paymentwallet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.capgemini.paymentwallet.bean.AccountDetails;
import com.capgemini.paymentwallet.util.DBUtil;

public class WalletAppDAO implements IWalletAppDAO{

	private Connection con;

	public boolean loginAccount(String uName, String uPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean checkUserName(String uName) {
		// TODO Auto-generated method stub
		return false;
	}

	int n=0;
	public boolean addWalletDetails(AccountDetails wallet) {
		
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		
			String updateQuery = "Insert into customerDetails values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt;
			try {
				pstmt = conn.prepareStatement(updateQuery);
			pstmt.setString(1, wallet.getCustomerDetails().getAadharNo());
			pstmt.setString(2, wallet.getCustomerDetails().getCustName());
			pstmt.setInt(3, wallet.getCustomerDetails().getAge());
			pstmt.setString(4, wallet.getCustomerDetails().getGender());
			pstmt.setString(5, wallet.getCustomerDetails().getCustMobileNo());
			pstmt.setString(6, wallet.getCustomerDetails().getCustAddress());
			pstmt.setString(7, wallet.getCustomerDetails().getCustEmail());
			pstmt.setString(8, wallet.getCustomerDetails().getuName());
			pstmt.setString(9, wallet.getCustomerDetails().getuPassword());
	}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
			
			
			
			
		
		
		
		
	}

	public float showBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean withdrawAmount(float amount) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean fundTransfer(int accNo, float amount) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean depositAmount(float amount) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<String> printTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
