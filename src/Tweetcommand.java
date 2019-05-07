
import java.util.Scanner;

public class Tweetcommand {
    public  static void settweet()  {
        Scanner jin = new Scanner(System.in);
        if(Main.myuser==null){
            System.out.println("please login/sign up first");
        }
        else{
            String statment1,statment2;
            System.out.println("Please type your Tweet");
            //while(jin.hasNext()){
                statment2=jin.nextLine();
                //statment=statment1+statment2;
            //}

            tweet mytweet=new tweet(statment2, Main.myuser);
            Main.allTweets.add(mytweet);

            Main.myuser.setTweet(mytweet,Main.myuser);
        }
    }
}
