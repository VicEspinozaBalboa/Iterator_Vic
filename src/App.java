import java.util.List;

import com.elenasoft.behavior.FacebookApi;
import com.elenasoft.behavior.FacebookUser;
import com.elenasoft.behavior.GoogleApi;
import com.elenasoft.behavior.GoogleUser;

public class App {
    public static void main(String[] args) throws Exception {
        
        GoogleUser[] googleUser = GoogleApi.getGoogleUser();
        
        for(int i = 0; i < googleUser.length; i++){
            System.out.println(googleUser[i]);
             
        }
        
        List<FacebookUser> facebookUsers = FacebookApi.getFacebookUsers();
        for(int i = 0; i < facebookUsers.size(); i++){
            System.out.println(facebookUsers.get(i));
             
        }
    }
}
