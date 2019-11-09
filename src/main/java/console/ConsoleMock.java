package console;

import console.menu.LoggedInMenu;
import model.user.UserProfile;
import warehouse.AccountWarehouse;
import warehouse.UserProfileWarehouse;

public class ConsoleMock {
    private UserProfileWarehouse userProfileWarehouse;
    private AccountWarehouse accountWarehouse;

    //Constructor that pulls the users profile and account once credentials are entered at the login menu
    public ConsoleMock(UserProfileWarehouse userProfileWarehouse, AccountWarehouse accountWarehouse){
        this.userProfileWarehouse = userProfileWarehouse;
        this.accountWarehouse = accountWarehouse;

    }

    public void mainMenu() {
        //getIntegerInput() takees in the "input" number which is linked to the mainMenuActions(input) method
        //and calls the specified methods in depending on the integer that is "input".
        Integer input = Console.getIntegerInput(
                "\nWelcome to the Bank of Kane ATM. Please select an option.\n\n" +
                        "1. Login\n" +
                        "2. Register\n" +
                        "3. Exit \n");
        //Explained above
        mainMenuActions(input);
    }

    private void mainMenuActions(Integer input) {
        switch (input) {
            case 1:
                //userName & password - takes in string input and then assigned to authenticate method..
                //Authenticate then passes the userName & password to the user profile warehouse to confirm
                //the proper credentials have been entered
                String userName = promptForUserName();
                String password = promptForPassword();
                UserProfile selectedProfile = authenticate(userName, password);
                //After being verified the selectedProfile is passed to LoggedInMenu and takes you to the next action menu
                LoggedInMenu loggedInMenu = new LoggedInMenu(userProfileWarehouse, accountWarehouse, selectedProfile);
                loggedInMenu.getLoggedInMenu();
                break;
            case 2:
                //createProfile method takes all the information into the userProfile and passes the info
                //to the userProfileWarehouse for storage
                //takes you back to the mainMenu to sign in with new credentials and takes you through
                //the steps above
                createProfile();
                mainMenu();
                break;
            case 3:
                //Exit method *should be obvi*
                Console.println("Bye!");
                System.exit(0);
                break;
            default:
                //defensive programming
                Console.println("\nInvalid selection. Please try again.");
                mainMenu();
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

    public void createProfile() {
        String firstName = Console.getStringInput("\nWhat is your first name?\n");
        String lastName = Console.getStringInput("\nWhat is your last name?\n");
        String userName = Console.getStringInput("\nWhat is your desired user name\n");
        String password = Console.getStringInput("\nWhat is your password\n");
        UserProfile newUser = new UserProfile(firstName, lastName, userName, password);
        userProfileWarehouse.add(newUser);
    }

   public UserProfile authenticate(String userName, String password) {
        UserProfile selectedProfile = userProfileWarehouse.getUserProfileByUserName(userName);
        if (selectedProfile != null && userProfileWarehouse.validatePassword(selectedProfile,password) ) {
            Console.println("Logged in successfully.");
            return selectedProfile;
        } else {
            Console.println("Invalid username or password. Please try again.");
            mainMenu();
        } return null;
    }
}