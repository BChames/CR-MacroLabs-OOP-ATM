package services;

import models.Account;
import models.UserProfile;
import models.UserProfileWarehouse;

public class SelectAccountMenu {

    public void getSelectAccountMenu(Integer input, UserProfileWarehouse userProfileList, String userName ,UserProfile userProfile) {
        input = Console.getIntegerInput(
                "\nWhich account would you like to access?.\n\n" +
                        "1. Checking Account\n" +
                        "2. Savings Account\n" +
                        "3. Investment Account" +
                        "4. Back to Previous Menu \n" +
                        "5. Logout and return to Main Menu \n");
        selectAccountMenuActions(input, userProfileList, userName, userProfile);
    }

    private void selectAccountMenuActions(Integer input, UserProfileWarehouse userProfileHouse, String userName, UserProfile userProfile) {
        //Determine what the user wants to do and call relevant methods
        AccountActionMenu accountActionMenu = new AccountActionMenu();
        switch (input) {
            case 1:
                Account checkingAccount = userProfile.getCheckingAccount();
                accountActionMenu.getAccountActionMenu(checkingAccount, userProfileHouse, userProfile, userName);
                break;
            case 2:
                Account savingsAccount = userProfile.getSavingsAccount();
                accountActionMenu.getAccountActionMenu(savingsAccount, userProfileHouse, userProfile, userName);
                break;
            case 3:
                Account investmentAccount = userProfile.getInvestmentAccount();
                accountActionMenu.getAccountActionMenu(investmentAccount, userProfileHouse, userProfile, userName);
                break;
            case 4:
                LoggedInMenu loggedInMenu = new LoggedInMenu();
                loggedInMenu.getLoggedInMenu(userProfileHouse, userName, userProfile);
                break;
            case 5:
                ConsoleMock consoleMock = new ConsoleMock();
                consoleMock.mainMenu(userProfileHouse);
                break;
            default:
                Console.println("\nInvalid selection. Please try again.");
                getSelectAccountMenu(input, userProfileHouse, userName, userProfile);
        }
    }

}
