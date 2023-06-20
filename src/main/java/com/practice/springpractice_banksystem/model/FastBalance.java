package com.practice.springpractice_banksystem.model;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class FastBalance {

    private Long from;
    private Long to;
    private BigDecimal amount;


}
