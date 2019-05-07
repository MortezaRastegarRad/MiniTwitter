
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static ArrayList<User> users = new ArrayList<User>();
    static ArrayList<tweet> allTweets = new ArrayList<tweet>();
    static User myuser=null;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner jin =new Scanner(System.in);
        String command;

        boolean close=true;
        ReadFromFilee.ReadTweetsAndUsers();
        //deleteezafe();
        while (close){
            ShowMenu.Showmenu();
            command =jin.nextLine().toLowerCase();
            switch (command){
                case "sign up":
                    signup.Sign();
                    break;
                case "login":
                    login.In();
                    break;
                case "logout":
                    logout.Out();
                    break;
                case "quit":
                    System.out.println("your program shut down");
                    WriteToFilee.WriteTweetsAndUsers();
                    close=false;
                    break;
                case "my profile":
                    if(Main.myuser==null){
                        System.out.println("please login/sign up first");
                    }
                    User.showprofile(myuser);
                    break;
                case "tweet":
                    Tweetcommand.settweet();
                    break;
                case "follow":
                    Follow.follow();
                    break;
                case "un follow":
                    Follow.unfollow();
                    break;
                case "followers":
                    myuser.showfollowers();
                    break;
                case "followings":
                    myuser.showfollowing();
                    break;
                case "timeline":
                    TimeLine.timeLine();
                    break;
                case "profile":
                    Profile.pro();
                    break;
                case "like":
                    Like.like();
                    break;
                case "bio":
                    Bio.bio();
                    break;
                default:
                    System.out.println("incorrect command ...");



            }

        }
    }
}
