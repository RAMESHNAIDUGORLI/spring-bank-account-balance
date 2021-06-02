package com.bank.account.external.respository.jpa;
  
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.account.delivery.values.AccountInfo;


@Repository
public interface GetBalanceJpaRepository extends JpaRepository<AccountInfo,Integer>{
  
	
	List<AccountInfo> findAll();

	AccountInfo findByAccountId(String accountId);
  
  }
 