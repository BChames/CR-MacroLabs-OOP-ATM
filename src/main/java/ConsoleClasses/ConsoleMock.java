package ConsoleClasses;

import Misc.UserProfile;


public class ConsoleMock {
    Integer input = 0;

    public void mainMenu() {
        //Ask user to login, create account, or exit. Take input and call nextStep and pass input
        input = Console.getIntegerInput(
                "\nWelcome to the Bank of Kane ATM. Please select an option.\n\n" +
                        "1. Login\n" +
                        "2. Register\n" +
                        "3. Exit \n");
        //Call nextStep
        nextStep(input);
    }

    public void nextStep(Integer input) {
        //Determine what the user wants to do and call relevant methods
        switch (input) {
            case 1:
                promptForUserName();
                promptForPassword();
                break;
            case 2:
                getProfileAttributes();
                break;
            case 3:
                Console.println("Bye!");
                System.exit(0);
                break;
            default:
                Console.println("\nInvalid selection. Please try again.");
                mainMenu();
        }

    }

    public String promptForUserName() {
        String userName = Console.getStringInput("What is your user name?");
        return userName;
    }

    public String promptForPassword() {
        String password = Console.getStringInput("What is your password?");
        return password;
    }

    public void getProfileAttributes() {
        String firstName = Console.getStringInput("\nWhat is your first name?\n");
        String lastName = Console.getStringInput("\nWhat is your last name?\n");
        String userName = Console.getStringInput("\nWhat is your desired user name\n");
        String password = Console.getStringInput("\nWhat is your password\n");
        createNewProfile(firstName, lastName, userName, password);
    }

    public void createNewProfile(String firstName, String lastName, String userName, String password) {
        UserProfile newUser = new UserProfile(firstName, lastName, userName, password);
    }

}