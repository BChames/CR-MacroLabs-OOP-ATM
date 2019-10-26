package AccountClassTests;

import AccountClasses.CheckingAccount;
import org.junit.Assert;
import org.junit.Test;

public class CheckingAccountTests {

    @Test
    public void constructorTest() {
        CheckingAccount checkingAccount = new CheckingAccount();
    }

    @Test
    public void getAccountNumberTest() {
        CheckingAccount checkingAccount = new CheckingAccount();

        Integer actual = checkingAccount.getAccountNumber();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAccountBalanceTest() {
        CheckingAccount checkingAccount = new CheckingAccount();

        Double actual = checkingAccount.getAccountBalance();
        Double expected = 0.00;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void withdrawTest(){
        CheckingAccount checkingAccount = new CheckingAccount();

        Double actual = checkingAccount.withdraw(50.00);
        Double expected = -50.00;

        Assert.assertEquals(expected, actual);
    }
}

