package ma.sdia.bankservice._tools.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.sdia.bankservice._tools.enums.AccountType;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccountRequestDTO {

    private Double balance;
    private String currency;
    private AccountType type;
}
