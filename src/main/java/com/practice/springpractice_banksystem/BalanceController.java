package com.practice.springpractice_banksystem;

import com.practice.springpractice_banksystem.model.FastBalance;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController("/balance")
@AllArgsConstructor
public class BalanceController {

    private final BankService bankService;

    @GetMapping("/{accountId}")
    public BigDecimal getBalance(@PathVariable Long accountId){
        return BankService.getBalance(accountId);
    }
    @PostMapping("/add")
    public BigDecimal addMoney(@RequestBody FastBalance fastBalance) {
        return BankService.addMoney(fastBalance.getTo(), fastBalance.getAmount());
    }
    @PostMapping("/transfer")
    public void transferMoney(@RequestBody FastBalance fastBalance) {
        BankService.transferMoney(fastBalance);
    }




}
