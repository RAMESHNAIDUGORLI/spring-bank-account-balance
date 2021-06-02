/*
 * package com.bank.account.domain;
 * 
 * import java.util.List;
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * 
 * import com.auth.spy.external.repository.entities.Authenticator; import
 * com.auth.spy.external.repository.jpa.UserAuthenticatorJpaRepository; import
 * com.bank.account.delivery.values.AccountInfo;
 * 
 * @Repository public interface GetAccountBalance extends
 * JpaRepository<Authenticator, String>{
 * 
 * private final GetBalanceJpaRepository getBalanceJpaRepository;
 * 
 * public GetUserDetails(GetBalanceJpaRepository getBalanceJpaRepository) {
 * this.getBalanceJpaRepository = getBalanceJpaRepository; }
 * 
 * 
 * public List<AccountInfo> go(String userId) { return
 * getBalanceJpaRepository.findAllByUserId(userId); } }
 */