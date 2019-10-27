package models;

public abstract class Account {
    private Integer accountNumber = 0;
    private Double accountBalance = 0.00;

    public Account(){
    }


    public Integer getAccountNumber() {
        return this.accountNumber;
    }

    public Double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
