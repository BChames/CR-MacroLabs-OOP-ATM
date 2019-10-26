package AccountClasses;

public abstract class Account {
    Integer accountNumber = 0;
    Double accountBalance = 0.00;

    public Account(){
        accountNumber++;
    }

    public Integer getAccountNumber() {
        return this.accountNumber;
    }

    public Double getAccountBalance(){
        return this.accountBalance;
    }


}
