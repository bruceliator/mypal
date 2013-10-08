package com.in6k;

import java.util.Date;

public class Transaction {
    private Date date;
    private String debetaccount;
    private String creditaccount;
    private int amount;

    public Transaction(String debetaccount, String creditaccount, int amount, Date date) {
        this.date = date;
        this.debetaccount = debetaccount;
        this.creditaccount = creditaccount;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAmount(int i) {
        this.amount = i;
    }

    public void setDebetAccount(String receiver) {
        this.debetaccount = receiver;
    }

    public void setCreditAccount(String sender) {
        this.creditaccount = sender;
    }

    public String getDebetAccount() {
        return debetaccount;
    }

    public String getCreditAccount() {
        return creditaccount;
    }

    public int getAmount() {
        return amount;
    }
}
