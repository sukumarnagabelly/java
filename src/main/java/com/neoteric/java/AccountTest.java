package com.neoteric.java;

import java.util.Date;

public class AccountTest {
    public static void main(String[] args) {
        Account account=new Account("sukumar","123456","ABC123",new Date());
        System.out.println(account.getAccountHolderName());
        System.out.println(account.getAdharNo());
        System.out.println(account.getPan());
        System.out.println(account.getDob());
    }

}
