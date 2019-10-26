package AccountClassTests;

import AccountClasses.Account;
import org.junit.Assert;
import org.junit.Test;

    public class AccountTests {

        /**Account is an abstract class and cannot be instantiated. Refer to subclass tests instead.**/


        public void constructorTest() {
            Account account = new Account();
        }

        @Test
        public void getAccountNumberTest() {
            Account account = new Account();

            Integer actual = account.getAccountNumber();
            Integer expected = 1;

            Assert.assertEquals(expected, actual);
        }

        @Test
        public void getAccountBalanceTest() {
            Account account = new Account();

            Double actual = account.getAccountBalance();
            Double expected = 0.00;

            Assert.assertEquals(actual, expected);
        }



    }