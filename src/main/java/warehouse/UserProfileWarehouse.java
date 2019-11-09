package warehouse;

import model.user.UserProfile;

import java.util.HashMap;
import java.util.Map;

public class UserProfileWarehouse {


    //Private because these attributes should not be modified/accessible by any other class but UserProfileWarehouse
    //HashMap is a Map based collection class that is used for storing Key & value pairs.
    //Volatile keyword is used to mark a Java variable as "being stored in main memory" not just the cpu cache
    //Hashmap is storing string keys anf user profile values
    private volatile Map<String, UserProfile> userProfiles = new HashMap<>();


    //Method that does not return a value but adds the userprofile to the Hashmap by using put()
    //Method runs a new hashmap by calling userProfiles
    //put() takes 2 parameters. "key" which is a String "username" and the users profile as the value
    //which holds the object info.
    public void add(UserProfile userProfile){
        userProfiles.put(userProfile.getUserName(),userProfile);
    }

    //Get profile by username by using the hashmap 'userProfiles' "get" method to retrieve the specified user
    public UserProfile getUserProfileByUserName(String userName){
        return userProfiles.get(userName);
    }


    //Method to validate the users password after entry
    //Takes two parameters
    //Uses the UserProfile password getter and returns boolean
    public Boolean validatePassword(UserProfile userProfile, String password){
        String userPassword = userProfile.getPassword();
        return password.equals(userPassword);
    }

    //Remove user profile by using the method below
    public void removeUserProfile(UserProfile userProfile) {
        removeUserProfileByUserName(userProfile.getUserName());
    }


    //Remove userprofile by using the hashmaps "remove" method
    public void removeUserProfileByUserName(String userName) {
        userProfiles.remove(userName);
    }
}
