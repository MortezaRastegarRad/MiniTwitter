
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteToFilee {
    public static void WriteTweetsAndUsers()throws IOException, ClassNotFoundException   {
        FileOutputStream inputfile=new FileOutputStream("Myfile.txt");
        ObjectOutputStream out=new ObjectOutputStream(inputfile);
        out.writeInt(Main.allTweets.size());//dakhele read n hastesh
        for (tweet T:Main.allTweets) {
            out.writeObject(T);
        }
        out.writeInt(Main.users.size());//dakhele read m hastesh
        for(User user : Main.users){
            out.writeObject(user);
            /*
            out.writeInt(user.followings.size());//dakhele read k hastesh
            for (int i=0;i<user.followings.size();i++){
                out.writeObject(user.followings.get(i));
            }
            out.writeInt(user.followers.size());//dakhele read k hastesh
            for (int i=0;i<user.followers.size();i++){
                out.writeObject(user.followers.get(i));
            }
            out.writeInt(user.tweets.size());
            for (int i=0;i<user.tweets.size();i++){
                out.writeObject(user.tweets.get(i));
            }
            */
        }

    }

}
