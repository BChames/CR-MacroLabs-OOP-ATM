package services;

import models.UserProfile;
import models.UserProfileWarehouse;

public class ConsoleMock {

    public void mainMenu(UserProfileWarehouse userProfileHouse) {
        //Ask user to login, create account, or exit. Take input and call nextStep and pass input
        Integer input = Console.getIntegerInput(
                "\nWelcome to the Bank of Kane ATM. Please select an option.\n\n" +
                        "1. Login\n" +
                        "2. Register\n" +
                        "3. Exit \n");
        //Call nextStep
        mainMenuActions(input, userProfileHouse);
    }

    private void mainMenuActions(Integer input, UserProfileWarehouse userProfileHouse) {
        //Determine what the user wants to do and call relevant methods
        switch (input) {
            case 1:
                String userName = promptForUserName();
                String password = promptForPassword();
                authenticate(userName, password, userProfileHouse);
                break;
            case 2:
                createProfile(userProfileHouse);
                mainMenu(userProfileHouse);
                break;
            case 3:
                Console.println("Bye!");
                System.exit(0);
                break;
            default:
                Console.println("\nInvalid selection. Please try again.");
                //Main.mainMenu();
        }

    }

    public void loggedInMenu(UserProfileWarehouse userProfileHouse) {
        //Ask user to login, create account, or exit. Take input and call nextStep and pass input
        Integer input = Console.getIntegerInput(
                "\nWhat would you like to do?\n\n" +
                        "1. Access Account\n" +
                        "2. Create Account\n" +
                        "3. Back to Main Menu \n");
        //Call nextStep
        loggedInMenuActions(input, userProfileHouse);
    }

    private void loggedInMenuActions(Integer input, UserProfileWarehouse userProfileHouse) {
        //Determine what the user wants to do and call relevant methods
        switch (input) {
            case 1:
                selectAccountMenu(input, userProfileHouse);
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
                mainMenu(userProfileHouse);
        }

    }

    public void selectAccountMenu(Integer input, UserProfileWarehouse userProfileList) {
        input = Console.getIntegerInput(
                "\nWhich account would you like to access?.\n\n" +
                        "1. Checking Account\n" +
                        "2. Savings Account\n" +
                        "3. Investment Account" +
                        "4. Back to Previous Menu \n" +
                        "4. Back to Main Menu \n");
    }

    private void selectAccountMenuActions(Integer input, UserProfileWarehouse userProfileHouse) {
        //Determine what the user wants to do and call relevant methods
        switch (input) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                Console.println("Bye!");
                System.exit(0);
                break;
            default:
                Console.println("\nInvalid selection. Please try again.");
                mainMenu(userProfileHouse);
        }
    }

    public void createAccountMenu(Integer input, UserProfileWarehouse userProfileList) {
        input = Console.getIntegerInput(
                "\nWhich account would you like to create?.\n\n" +
                        "1. Checking Account\n" +
                        "2. Savings Account\n" +
                        "3. Investment Account" +
                        "4. Back to Previous Menu \n" +
                        "4. Back to Main Menu \n");
    }

    private void createAccountMenuActions(Integer input, UserProfileWarehouse userProfileHouse) {
        //Determine what the user wants to do and call relevant methods
        switch (input) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                Console.println("Bye!");
                System.exit(0);
                break;
            default:
                Console.println("\nInvalid selection. Please try again.");
        }

    }


    private String promptForUserName() {
        String userName = Console.getStringInput("What is your username?");
        return userName;
    }

    private String promptForPassword() {
        String password = Console.getStringInput("What is your password?");
        return password;
    }

    private void createProfile(UserProfileWarehouse userProfileHouse) {
        String firstName = Console.getStringInput("\nWhat is your first name?\n");
        String lastName = Console.getStringInput("\nWhat is your last name?\n");
        String userName = Console.getStringInput("\nWhat is your desired user name\n");
        String password = Console.getStringInput("\nWhat is your password\n");
        UserProfile newUser = new UserProfile(firstName, lastName, userName, password);
        userProfileHouse.add(newUser);
    }

   public void authenticate(String userName, String password, UserProfileWarehouse userProfileHouse) {
        if (userProfileHouse.getUserProfileByUserNameAndPW(userName, password) != null) {
            //callnextmenu
            System.out.println("Logged in successfully.");
        } else {
            System.out.println("Invalid username or password. Please try again.");
            mainMenu(userProfileHouse);
        }
    }
}