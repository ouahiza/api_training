package fr.esiea.ex4A.meetmock;

public class UserData {
    //Attibuts
    private String userName;
    private String userEmail;
    private String userTwitter;
    private String userCountry;
    private String userSex;
    private String userSexPref;

    public UserData(String userName, String userEmail, String userTwitter, String userCountry, String userSex, String userSexPref) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userTwitter = userTwitter;
        this.userCountry = userCountry;
        this.userSex = userSex;
        this.userSexPref = userSexPref;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTwitter() {
        return userTwitter;
    }

    public void setUserTwitter(String userTwitter) {
        this.userTwitter = userTwitter;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserSexPref() {
        return userSexPref;
    }

    public void setUserSexPref(String userSexPref) {
        this.userSexPref = userSexPref;
    }
}
