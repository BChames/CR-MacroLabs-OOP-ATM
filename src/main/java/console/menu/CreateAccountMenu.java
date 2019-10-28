package console.menu;

import console.ConsoleMock;
import model.account.Account;
import model.account.CheckingAccount;
import console.Console;
import model.user.UserProfile;
import service.AccountServices;
import warehouse.AccountWarehouse;
import warehouse.UserProfileWarehouse;

public class CreateAccountMenu {

    public void createAccountMenu(Integer input, UserProfileWarehouse userProfileList) {
        input = Console.getIntegerInput(
                "\nWhich account would you like to create?.\n\n" +
                        "1. Checking Account\n" +
                        "2. Savings Account\n" +
                        "3. Investment Account" +
                        "4. Back to Previous Menu \n" +
                        "5. Back to Main Menu \n");
    }
//TODO: pass in user profile instead of user name
    private void createAccountMenuActions(Integer input, UserProfileWarehouse userProfileHouse, String userName) {
        //Determine what the user wants to do and call relevant methods
        switch (input) {
            case 1:
                CheckingAccount checkingAccount = new CheckingAccount();
                //TODO: check if needed
                UserProfile userProfile = userProfileHouse.getUserProfileByUserName(userName);

                break;
            case 2:

                break;
            case 5:
                Console.println("Bye!");
                System.exit(0);
                break;
            default:
                Console.println("\nInvalid selection. Please try again.");
        }

    }
}



