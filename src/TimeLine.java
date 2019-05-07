import java.util.*;

public class TimeLine {

    public static void timeLine() {
        if(Main.myuser==null){
            System.out.println("please login/sign up first");
        }
        else {
            ArrayList<tweet> Tweets = new ArrayList<tweet>();
            Tweets.addAll(Main.myuser.tweets);
            for (int i = 0; i < Main.myuser.followings.size(); i++) {
                Tweets.addAll(Main.myuser.followings.get(i).tweets);
            }

            Set<tweet> var1 = new HashSet<tweet>(Tweets);
            Tweets.clear();
            Tweets.addAll(var1);
            var1.clear();

            Collections.sort(Tweets, Comparator.comparing(o -> o.timeofTweet));
            for (tweet T : Tweets) {
                System.out.println(T);
            }
        }
    }
}
