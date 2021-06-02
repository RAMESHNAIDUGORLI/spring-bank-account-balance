/*
 * package com.bank.account.delivery;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.account.balance.delivery.v1.model.Response; import
 * com.bank.account.delivery.values.AccountInfo; import
 * com.bank.account.external.respository.jpa.GetBalanceJpaRepository;
 * 
 * @Service public class GetAccountBalance {
 * 
 * @Autowired GetBalanceJpaRepository getBalanceRepository;
 * 
 * public Response getBalance(String accountId) {
 * 
 * AccountInfo accountInfo = getBalanceRepository.findByAccountId(accountId);
 * Response res = new
 * Response(accountInfo.getAccountid(),accountInfo.getAmount(),accountInfo.
 * getCurrency(),accountInfo.getUserId()); return res;
 * 
 * }
 * 
 * }
 */