package ma.sdia.bankservice.sevice;



import ma.sdia.bankservice._tools.dto.BankAccountRequestDTO;
import ma.sdia.bankservice._tools.dto.BankAccountResponseDTO;
import ma.sdia.bankservice._tools.entities.Account;

import java.util.List;


public interface AccountService {

    List<Account> getAccounts();
    BankAccountResponseDTO getAccountById(String id);
    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO account);
    void deleteAccountById(String id);
    public BankAccountResponseDTO addAcount(BankAccountRequestDTO bankAccountDTO);

}
