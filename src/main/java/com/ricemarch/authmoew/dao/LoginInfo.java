package com.ricemarch.authmoew.dao;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class LoginInfo {

    private long id;

    private String name;

    private String password;

    private BigDecimal locationX;

    private BigDecimal locationY;

    private BigDecimal locationZ;

    private String gameMode;

}
