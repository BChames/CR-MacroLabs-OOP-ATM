package services;

import models.UserProfile;
import models.UserProfileWarehouse;

public class LoggedInMenu {

    public void getLoggedInMenu(UserProfileWarehouse userProfileHouse, String userName, UserProfile userProfile) {
        Integer input = Console.getIntegerInput(
                "\nWhat would you like to do?\n\n" +
                        "1. Access Account\n" +
                        "2. Create Account\n" +
                        "3. Back to Main Menu \n");
        //Call nextStep
        loggedInMenuActions(input, userProfileHouse, userName, userProfile);
    }

    private void loggedInMenuActions(Integer input, UserProfileWarehouse userProfileHouse, String userName, UserProfile userProfile) {
        //Determine what the user wants to do and call relevant methods
        switch (input) {
            case 1:
                SelectAccountMenu selectAccountMenu = new SelectAccountMenu();
                selectAccountMenu.getSelectAccountMenu(input, userProfileHouse, userName, userProfile);
                break;
            case 2:
                //Get account creation menu
                break;
            case 3:
                Console.println("Bye!");
                System.exit(0);
                break;
            default:
                Console.println("\nInvalid selection. Please try again.");
                ConsoleMock consoleMock = new ConsoleMock();
                consoleMock.mainMenu(userProfileHouse);
        }

    }
}
