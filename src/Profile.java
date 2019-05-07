import java.util.Scanner;

public class Profile {
    public static void pro(){
        if(Main.myuser==null){
            System.out.println("please login/sign up first");
        }
        else {
            Scanner jin = new Scanner(System.in);
            System.out.print("Please enter username : ");
            String username = jin.next();
            for (int i = 0; i < Main.users.size(); i++) {
                if (username.equals(Main.users.get(i).getname())) {
                    System.out.println(Main.users.get(i).getBio());
                    for (int j = 0; j < Main.users.get(i).tweets.size(); j++) {
                        tweet.showtweet(Main.users.get(i).tweets.get(j));//vaqty nemikhay extend kony az esm klasy k mikhay extend kony estefade kon bad . bad function morede nazar
                    }
                }
            }
        }
    }
}
