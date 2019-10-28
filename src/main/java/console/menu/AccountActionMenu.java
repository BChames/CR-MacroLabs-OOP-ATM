package console.menu;

import console.Console;
import console.ConsoleMock;
import model.account.Account;
import model.user.UserProfile;
import service.AccountServices;
import warehouse.AccountWarehouse;
import warehouse.UserProfileWarehouse;

public class AccountActionMenu {
    private UserProfileWarehouse userProfileWarehouse;
    private AccountWarehouse accountWarehouse;
    private Account currentAccount;
    private UserProfile userProfile;
    private AccountServices accountServices;


    public AccountActionMenu(UserProfileWarehouse userProfileWarehouse, AccountWarehouse accountWarehouse, Account account, UserProfile userProfile){
        this.userProfileWarehouse = userProfileWarehouse;
        this.accountWarehouse = accountWarehouse;
        this.currentAccount = account;
        this.userProfile = userProfile;
        accountServices = new AccountServices(accountWarehouse);
    }

    public void getAccountActionMenu() {
        Integer input = Console.getIntegerInput(
                "\nWhat would you like to do?\n\n" +
                        "1. Withdraw\n" +
                        "2. Deposit\n" +
                        "3. Transfer money\n" +
                        "4. Check balance\n" +
                        "5. Back to Previous Menu \n" +
                        "6. Back to Main Menu \n");
        accountActionMenuActions(input);
    }

    private void accountActionMenuActions(Integer input) {
        switch (input) {
            case 1:
                Double withdrawAmt = Console.getDoubleInput("How much would you like to withdraw?");
                accountServices.withdraw(currentAccount, withdrawAmt);
                break;
            case 2:
                Double depositAmt = Console.getDoubleInput("How much would you like to deposit?");
                accountServices.withdraw(currentAccount, depositAmt);
                break;
            case 3:
                //TODO Need to finish this
                break;
            case 4:
                System.out.println(currentAccount.getAccountBalance());
                break;
            case 5:
                LoggedInMenu loggedInMenu = new LoggedInMenu(userProfileWarehouse, accountWarehouse, userProfile);
                loggedInMenu.getLoggedInMenu();
                break;
            case 6:
                ConsoleMock consoleMock = new ConsoleMock(userProfileWarehouse, accountWarehouse);
                consoleMock.mainMenu();
                break;
            default:
                Console.println("\nInvalid selection. Please try again.");
                getAccountActionMenu();
        }
    }
}