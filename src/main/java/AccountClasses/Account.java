package AccountClasses;

public class Account {
    Integer accountNumber;
    Double accountBalance = 0.00;


    protected void Account(){

    }

    public Integer getAccountNumber() {
        return this.accountNumber;
    }

    public Double getAccountBalance(){
        return this.accountBalance;
    }

    public void setAccountBalance(Double newBalance) {
        this.accountBalance = newBalance;
    }

    public void setAccountNumber(Integer newAcctNumber) {
        this.accountNumber = newAcctNumber;
    }


}
