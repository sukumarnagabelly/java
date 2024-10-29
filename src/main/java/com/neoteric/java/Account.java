package com.neoteric.java;


import java.util.Date;

public class Account {
    public String accountHolderName;
    public String adharNo;
    public  String pan;
    public Date dob;

    public Account(String accountHolderName,String adharNo,String pan,Date dob){
        this.accountHolderName=accountHolderName;
        this.adharNo=adharNo;
        this.pan=pan;
        this.dob=dob;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAdharNo() {
        return adharNo;
    }

    public String getPan() {
        return pan;
    }

    public Date getDob() {
        return dob;
    }
}
