package AccountClasses.AccountStorage;

import AccountClasses.Account;
import java.util.ArrayList;

public class AccountWarehouse<AccountType extends Account> {

    private volatile ArrayList<AccountType> accountList = new ArrayList<>();

    /*
    public void add(UserProfile userProfile) {
        userProfilesList.add(userProfile);
    }

    public UserProfile getUserProfileByUserName(String userName) {
        for(UserProfile userProfile : userProfilesList) {
            if(userProfile.getUserName().equals(userName)) {
                return userProfile;
            }
        }
        return null;
    }

    public void removeUserProfile(UserProfile userProfile) {
        userProfilesList.remove(userProfile);
    }

    public void removeUserProfileByUserName(String userProfile) {
        removeUserProfile(getUserProfileByUserName(userProfile));
    }

    public Integer getNumberOfProfiles() {
        return userProfilesList.size();
    }

    public void clearAllProfiles() {
        userProfilesList.clear();
    }

     */


}
