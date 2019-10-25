package AccountClassTests;

import AccountClasses.Account;
import org.junit.Assert;
import org.junit.Test;


public class AccountTests {

    @Test
    public void constructorTest() {
        Account account = new Account();
    }

    @Test
    public void getAccountNumberTest() {
        Account account = new Account();

        Integer actual = account.getAccountNumber();
        Integer expected = null;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getAccountBalanceTest() {
        Account account = new Account();

        Double actual = account.getAccountBalance();
        Double expected = 0.00;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setAccountBalanceTest() {
        Account account = new Account();
        account.setAccountBalance(54.23);

        Double actual = account.getAccountBalance();
        Double expected = 54.23;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setAccountNumberTest() {
        Account account = new Account();
        account.setAccountNumber(9876543);

        Integer actual = account.getAccountNumber();
        Integer expected = 9876543;

        Assert.assertEquals(actual, expected);
    }

}
