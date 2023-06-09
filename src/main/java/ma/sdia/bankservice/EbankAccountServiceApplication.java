package ma.sdia.bankservice;


import ma.sdia.bankservice._tools.entities.Account;
import ma.sdia.bankservice._tools.enums.AccountType;
import ma.sdia.bankservice.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class EbankAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbankAccountServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BankAccountRepository  bankAccountRepository){
		return args -> {
			for (int i=0;i<20;i++){
				Account bankAccount = Account.builder()
						.id(Integer.toString(i+1))
						.type(Math.random()>0.5? AccountType.CURRENT_ACCOUT : AccountType.SAVING_ACCOUNT)
						.balance(1000+Math.random()*9000)
						.createDate(new Date())
						.currency("MAD")
						.build();
				bankAccountRepository.save(bankAccount);
			}
		};
	}

}
