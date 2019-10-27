
import models.UserProfileWarehouse;
import services.ConsoleMock;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {


    public static void main(String[] args){
        ConsoleMock consoleMock = new ConsoleMock();
        UserProfileWarehouse userProfileHouse = new UserProfileWarehouse();
        consoleMock.mainMenu(userProfileHouse);
    }
}
