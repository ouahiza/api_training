package fr.esiea.ex4A.meetmock;

public class UserData {
    //Attibuts
    private final String userName;
    private final String userEmail;
    private final String userTwitter;
    private final String userCountry;
    private final String userSex;
    private final String userSexPref;

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

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserTwitter() {
        return userTwitter;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserSexPref() {
        return userSexPref;
    }
}
