package com.bank.account.delivery;

import org.springframework.stereotype.Component;

import com.account.balance.delivery.v1.model.Response;
import com.bank.account.delivery.values.AccountInfo;

@Component
public class AccountMapper {
	
	public Response map(AccountInfo accountInfo) {
		Response res = new Response();
		res.setAccountId(accountInfo.getAccountid());
		res.setAmount(accountInfo.getAmount());
		res.currency(accountInfo.getCurrency());
		res.setUserId(accountInfo.getUserId());
		return res;
	}

}
