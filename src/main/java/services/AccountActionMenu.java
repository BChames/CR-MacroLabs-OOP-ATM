package services;

import models.Account;
import models.UserProfile;
import models.UserProfileWarehouse;

public class AccountActionMenu {

    public void getAccountActionMenu(Account account, UserProfileWarehouse userProfileHouse, UserProfile userProfile, String username) {
        Integer input = Console.getIntegerInput(
                "\nWhat would you like to do?\n\n" +
                        "1. Withdraw\n" +
                        "2. Deposit\n" +
                        "3. Transfer Money" +
                        "4. Back to Previous Menu \n" +
                        "5. Back to Main Menu \n");
        accountActionMenuActions(input, account, userProfileHouse, userProfile, username);
    }

    private void accountActionMenuActions(Integer input, Account account, UserProfileWarehouse userProfileHouse, UserProfile userProfile, String username) {
        //Determine what the user wants to do and call relevant methods
        AccountServices accountServices = new AccountServices();
        switch (input) {
            case 1:
                Double withdrawAmt = Console.getDoubleInput("How much would you like to withdraw?");
                accountServices.withdraw(account, withdrawAmt);
                break;
            case 2:
                Double depositAmt = Console.getDoubleInput("How much would you like to deposit?");
                accountServices.withdraw(account, depositAmt);
                break;
            case 3:
                String targetUserProfile = Console.getStringInput("Who would you like to transfer money to?");
                UserProfile targetProfile = userProfileHouse.getUserProfileByUserName(targetUserProfile);
                //TODO Need to finish this
                break;
            case 4:
                LoggedInMenu loggedInMenu = new LoggedInMenu();
                loggedInMenu.getLoggedInMenu(userProfileHouse, username, userProfile);
                break;
            default:
                Console.println("\nInvalid selection. Please try again.");
                getAccountActionMenu(account, userProfileHouse, userProfile, username);
        }
    }
}
