package Entities;

import Exceptions.ValueException;

public class Account  {

    private Integer number;
    private String holder;
    private Double balance = 0.0;
    private double withdrawLimit;
    public Account() {
    }
    public Account(Integer number, String holder, Double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void setBalance(Double balance) {
        this.balance += balance;
    }

    public void Deposit(Double amount){
            this.balance += amount;
        }

    public void Withdraw(Double amount) throws ValueException {
        if(amount > getWithdrawLimit()){
            throw new ValueException("the amount excess withdraw limit");
        } else if (amount>getBalance()) {
            throw new ValueException("Not Enough Balance !");
        }else {
            this.balance -= amount;
        }
    }
}
