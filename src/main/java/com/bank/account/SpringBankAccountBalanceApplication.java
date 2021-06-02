package com.bank.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AppConfig.class})
public class SpringBankAccountBalanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBankAccountBalanceApplication.class, args);
	}

}
