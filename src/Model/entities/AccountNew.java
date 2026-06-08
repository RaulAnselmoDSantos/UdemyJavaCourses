package Model.entities;

import Model.exception.WithdrawException;

public class AccountNew extends Account {

    protected Integer number;
    protected Double balance;
    protected String holder;
    protected Double withdrawLimit;

    //Fow the new exercise of account
    public AccountNew (Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public void withdraw(Double amount){

        if (amount > balance) {
            throw new WithdrawException("The amount exceeds the balance");
        }
        if (amount > withdrawLimit) {
            throw new WithdrawException("The amount exceeds withdraw limit");
        }
        balance -= amount;
    }

    @Override
    public void deposit(Double amount){
        balance += amount;
    }
}
