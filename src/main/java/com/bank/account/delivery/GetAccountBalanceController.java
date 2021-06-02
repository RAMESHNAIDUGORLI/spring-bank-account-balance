package com.bank.account.delivery;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.account.balance.delivery.v1.api.GetAccountBalanceApi;
import com.account.balance.delivery.v1.model.Response;
import com.bank.account.delivery.values.AccountInfo;
import com.bank.account.external.respository.jpa.GetBalanceJpaRepository;



//import com.bank.account.domain.GetAccountBalance;
@RestController
@Service
public class GetAccountBalanceController implements GetAccountBalanceApi{
	
	
	/*
	 * private final GetAccountBalance getAccountBalance;
	 * 
	 * public GetAccountBalanceController(GetAccountBalance getAccountBalance) {
	 * this.getAccountBalance = getAccountBalance; }
	 */
	
	private final AccountMapper accountMapper;
	
	public GetAccountBalanceController(AccountMapper accountMapper) {
		this.accountMapper = accountMapper;
	}
	  @Autowired
	  GetBalanceJpaRepository getBalanceRepository;
	 
	  
	  //@SuppressWarnings("unchecked")
	  @Override 
	  public ResponseEntity<Response> getAccountBalance(String accountId, String currency) {
		  //List<AccountInfo> accountFullDet = getAccountBalance.go(accountId, currency); 
		 //List<AccountInfo> accounts = getBalanceRepository.findAll();
		 AccountInfo accountInfo =  getBalanceRepository.findByAccountId(accountId);
		 if(accountInfo !=null ) {
			Response res = accountMapper.map(accountInfo);
		  return new ResponseEntity<> (res, HttpStatus.OK);
		 }else {
			 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		 }
	  }
	 
}
