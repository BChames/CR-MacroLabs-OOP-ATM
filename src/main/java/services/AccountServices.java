package services;

import models.Account;

public class AccountServices {

    public Integer getAccountNumber(Account currentAccount) {
        return currentAccount.getAccountNumber();
    }

    public Double getAccountBalance(Account currentAccount) {
        return currentAccount.getAccountBalance();
    }

    public Double withdraw(Account currentAccount, Double withdrawAmt) {
        Double currentBalance = currentAccount.getAccountBalance();
        Double newBalance = currentBalance - withdrawAmt;
        currentAccount.setAccountBalance(newBalance);
        return newBalance;
    }

    public Double deposit(Account currentAccount, Double depositAmt) {
        Double currentBalance = currentAccount.getAccountBalance();
        Double newBalance = currentBalance + depositAmt;
        currentAccount.setAccountBalance(newBalance);
        return newBalance;
    }

    public void transferBetweenAccounts(Account sourceAccount, Account targetAccount, Double transferAmt) {
        withdraw(sourceAccount, transferAmt);
        deposit(targetAccount, transferAmt);
    }

}
