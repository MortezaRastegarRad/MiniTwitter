import java.io.Serializable;
import java.util.*;
public class tweet implements Serializable {
    String Tweet;
    int idofTweet;
    Set<String> numofuserthatliked;
    Date timeofTweet;
    User creator;


    tweet(String Tweet, User creator){
        this.Tweet=Tweet;
        this.timeofTweet = new Date();
        this.idofTweet = Main.allTweets.size();
        this.numofuserthatliked = new HashSet<String>();
        this.creator = creator;
    }


    public static void showtweet(tweet a){
        System.out.println("------------------------------------------------------------------------------------");
        System.out.print("Tweet : ");
        System.out.println(a.Tweet);
        System.out.print("Likes : ");
        System.out.println(a.numofuserthatliked.size());
        System.out.print("Id of Tweet : ");
        System.out.println(a.idofTweet);
        System.out.println("------------------------------------------------------------------------------------");
    }
    @Override
    public String toString(){
        String str = "------------------------------------------------------------------------------------\n";
        str += "username : " + creator.getname() +"\n"+ "tweets Id : " + idofTweet + '\n';
        str += Tweet + '\n';
        str += "likes : " + numofuserthatliked.size();
        str +="\n------------------------------------------------------------------------------------\n";
        return str;
    }
}