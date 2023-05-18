package ma.sdia.bankservice.repositories;

import ma.sdia.bankservice._tools.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<Account,String> {
}
