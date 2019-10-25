package java.AccountClassTests;

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

}
