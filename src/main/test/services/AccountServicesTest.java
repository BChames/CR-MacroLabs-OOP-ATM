package services;


import model.account.CheckingAccount;
import model.account.SavingsAccount;
import org.junit.Assert;
import org.junit.Test;
import service.AccountServices;

public class AccountServicesTest {
/*
    private AccountServices accountServices = new AccountServices();

    @Test
    public void getAccountNumber() {
        CheckingAccount checkingAccount = new CheckingAccount();

        Integer actual = accountServices.getAccountNumber(checkingAccount);
        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAccountBalance() {
        CheckingAccount checkingAccount = new CheckingAccount();

        Double actual = accountServices.getAccountBalance(checkingAccount);
        Double expected = 0.00;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withdraw() {
        CheckingAccount checkingAccount = new CheckingAccount();

        Double actual = accountServices.withdraw(checkingAccount, 50.00);
        Double expected = -50.00;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deposit() {
        CheckingAccount checkingAccount = new CheckingAccount();

        Double actual = accountServices.deposit(checkingAccount, 50.00);
        Double expected = 50.00;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void transferBetweenAccounts() {
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();

        accountServices.transferBetweenAccounts(checkingAccount, savingsAccount, 50.00);

        Double expectedSourceBalance = -50.00;
        Double actualSourceBalance = checkingAccount.getAccountBalance();

        Double expectedTargetBalance = 50.00;
        Double actualTargetBalance = savingsAccount.getAccountBalance();

        Assert.assertEquals(expectedSourceBalance, actualSourceBalance);
        Assert.assertEquals(expectedTargetBalance, actualTargetBalance);

    }

 */
}