package fr.esiea.ex4A.meetmock;

import fr.esiea.ex4A.meetmock.exceptions.ForbiddenException;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private ArrayList<UserData> users ;

    public UserRepository() {
        users = new ArrayList<UserData>();
    }

    //save user in users list, method used during signup
    UserData save(String userName, String userEmail, String userTwitter, String userCountry, String userSex, String userSexPref) throws ForbiddenException {
        if(userName.isEmpty() || userEmail.isEmpty() || userTwitter.isEmpty() || userCountry.isEmpty() || userSex.isEmpty() || userSexPref.isEmpty()) {
            throw new ForbiddenException("user info are not filled correctly");
        }
        UserData user = new UserData(userName, userEmail, userTwitter, userCountry, userSex, userSexPref);
        users.add(user);

        return user;
    }

    List<UserData> findByNameAndCountry(String userName, String userCountry){
        List<UserData> results = null;
        for (UserData user : users
             ) {
            if (user.getUserName() == userName && user.getUserCountry() == userCountry){
                results.add(user);
            }
        }
        return results;
    }

}
