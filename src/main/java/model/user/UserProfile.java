package model.user;

import java.util.ArrayList;
import java.util.List;
//Used to store user information in the userwarehouse
public class UserProfile {
    //Main attributes/identifiers of each user
    //Private because these attributes should not be modified by any other class but UserProfile
    //Because we've made the field variables private, we need another way to assign values to them
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private List<Integer> accountNumberList;

    //Constructor for when new users are created
    //Parameters will need to be satisfied to create a new user profile
    public UserProfile(String firstName, String lastName, String userName, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        //*******
        accountNumberList = new ArrayList<>();
    }

    //Getters and setter methods
    //Setters are for account/user creation
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAccountNumberList(List<Integer> accountNumberList) {
        this.accountNumberList = accountNumberList;
    }

    public List<Integer> getAccountNumberList() {
        return accountNumberList;
    }
    public void addAccountNumberToList(Integer accountNumber) {
        accountNumberList.add(accountNumber);


    }
}
