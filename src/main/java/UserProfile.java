public class UserProfile {
    String firstName;
    String lastName;
    String userName;
    String password;

    public void UserProfile(String firstName, String lastName, String userName, String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.password = password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getuserName() {
        return this.firstName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setUserName(String newUserName) {
        this.userName = newUserName;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

}
