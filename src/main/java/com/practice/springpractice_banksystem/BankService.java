package com.practice.springpractice_banksystem;

import com.practice.springpractice_banksystem.model.FastBalance;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class BankService {

    private final BalanceRepository balanceRepository;
    public BigDecimal getBalance(Long accountId) {
        BigDecimal balance = balanceRepository.getBalanceForId(accountId);

        if(balance == null)
            throw new IllegalArgumentException();
        else
            return balance;
    }
    public BigDecimal addMoney(Long to, BigDecimal amount) {

        return null;
    }
    public void transferMoney(FastBalance fastBalance) {


    }
}
