package com.bank.account.delivery.values;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "account_info")
public class AccountInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="ACCOUNT_ID")
	private String accountId;
	
	@Column(name="USER_ID")
	private String userId;
	
	@Column(name="AMOUNT")
	private String amount;
	
	@Column(name="CURRENCY")
	private String currency;
	
	
	public AccountInfo( Integer id, String accountId, String amount,String userId, String currency) {
		super();
		this.id = id;
		this.amount = amount;
		this.accountId = accountId;
		this.userId = userId;
		this.currency = currency;
	}

	public AccountInfo() {}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id =id;
	}
	
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public String getAccountid() {
		return accountId;
	}
	public void setAccountid(String accountid) {
		this.accountId = accountid;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "AccountInfo [id=\" + id + \", accountId=" + accountId + ", userId=" + userId + ", amount=" + amount + ", currency="
				+ currency + "]";
	}



	
}
