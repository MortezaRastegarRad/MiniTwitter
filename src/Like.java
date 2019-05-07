import java.util.HashMap;
import java.util.Scanner;

public class Like {
    public static HashMap<Integer,String> hashMap=new HashMap<>();
    public static void like() {
        hashMap.put(1,"ALI");
        if(Main.myuser==null){
            System.out.println("please login/sign up first");
        }
        else{
            boolean close=true;
            while (close) {
                boolean flag = true;
                Scanner jin = new Scanner(System.in);
                System.out.println("please input a tweets id");
                System.out.print("Id of Tweet : ");
                int id = Integer.parseInt(jin.next());
                for (tweet T : Main.allTweets) {
                    if (T.idofTweet == id) {
                        T.numofuserthatliked.add(Main.myuser.getname());
                        flag = false;
                        close = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Wrong Id" + "\n" + "This Id does not exist");
                }
            }
        }
    }
}
