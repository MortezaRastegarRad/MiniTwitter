import java.io.*;

public class ReadFromFilee {
    public static void ReadTweetsAndUsers() throws ClassNotFoundException, IOException  {
        FileInputStream input=null ;
        try {
            input = new FileInputStream("Myfile.txt");
        } catch (FileNotFoundException e) {
            return;
        }
        if (input.available() > 0) {
            ObjectInputStream jin = new ObjectInputStream(input);
            int n = jin.readInt();
            for (int i = 0; i < n; i++) {
                Main.allTweets.add((tweet) jin.readObject());
            }
            int m = jin.readInt();
            for (int i = 0; i < m; i++) {
                Main.users.add((User) jin.readObject());
            }
        }
    }
}
