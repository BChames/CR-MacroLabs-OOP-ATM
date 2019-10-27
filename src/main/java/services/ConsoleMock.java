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
                mainMenu(userProfileHouse);
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

    private UserProfile createProfile(UserProfileWarehouse userProfileHouse) {
        String firstName = Console.getStringInput("\nWhat is your first name?\n");
        String lastName = Console.getStringInput("\nWhat is your last name?\n");
        String userName = Console.getStringInput("\nWhat is your desired user name\n");
        String password = Console.getStringInput("\nWhat is your password\n");
        UserProfile newUser = new UserProfile(firstName, lastName, userName, password);
        userProfileHouse.add(newUser);
        return newUser;
    }

   public void authenticate(String userName, String password, UserProfileWarehouse userProfileHouse) {
        UserProfile selectedProfile = userProfileHouse.getUserProfileByUserNameAndPW(userName, password);
        if (selectedProfile != null) {
                System.out.println("Logged in successfully.");
                LoggedInMenu loggedInMenu = new LoggedInMenu();
                loggedInMenu.getLoggedInMenu(userProfileHouse, userName, selectedProfile);
            } else {
                System.out.println("Invalid username or password. Please try again.");
                mainMenu(userProfileHouse);
        }
    }
}