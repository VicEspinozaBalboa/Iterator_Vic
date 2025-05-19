import com.elenasoft.behavior.Aggregate;
import com.elenasoft.behavior.FacebookUserAgregate;
import com.elenasoft.behavior.GoogleUserAggregate;
import com.elenasoft.behavior.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        GoogleUser[] googleUser = GoogleApi.getGoogleUser();
        
        for(int i = 0; i < googleUser.length; i++){
            System.out.println(googleUser[i]);
             
        }
        
        List<FacebookUser> facebookUsers = FacebookApi.getFacebookUsers();

        for(int i = 0; i < facebookUsers.size(); i++){
            System.out.println(facebookUsers.get(i));
             
        }
        */

        Aggregate googleUserAggregate = new GoogleUserAggregate();
        Iterator googleUSerIterator = googleUserAggregate.createIterator();
        printUsers(googleUSerIterator);

        Aggregate facebookUserAggregate = new FacebookUserAgregate();
        Iterator facebookUSerIterator = facebookUserAggregate.createIterator();
        printUsers(facebookUSerIterator);
    
    }

    public static void printUsers(Iterator iterator){
        while (!iterator.isDone()) 
        {
           System.out.println(iterator.currentItem());
        } 
    }
}
