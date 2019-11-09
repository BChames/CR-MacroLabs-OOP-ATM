
import warehouse.AccountWarehouse;
import warehouse.UserProfileWarehouse;
import console.ConsoleMock;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {


    public static void main(String[] args){
        UserProfileWarehouse userProfileWarehouse = new UserProfileWarehouse();
        AccountWarehouse accountWarehouse = new AccountWarehouse();

        //Constructor that pulls the users profile and account once credentials are entered at the login menu
        //Instantiate at the start of the ATM.
        ConsoleMock consoleMock = new ConsoleMock(userProfileWarehouse, accountWarehouse);

        //Instantiate the consoleMock mainMenu() that holds the navigation through the startup menu
        consoleMock.mainMenu();
    }
}
