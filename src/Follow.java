import java.util.Scanner;

public class Follow {
    static Scanner jin = new Scanner(System.in);
    public static void follow(){
        if(Main.myuser==null){
            System.out.println("please login/sign up first");
        }
        else {
            boolean close = true;
            while (close) {
                System.out.print("please enter username : ");
                String username = jin.nextLine();
                if(username.equals(Main.myuser.getname())){
                    System.out.println("you cant follow your self");
                    close=false;
                }
                else {
                    int correct = 0;
                    for (int i = 0; i < Main.users.size(); i++) {
                        if (username.equals(Main.users.get(i).getname())) {
                            Main.myuser.follow(Main.users.get(i));
                            correct = 1;
                            close = false;
                        }
                    }
                    if (correct == 0) {
                        System.out.println("This username does not exist");
                    }
                }
            }
        }
    }
    public static void unfollow(){
        if(Main.myuser==null){
            System.out.println("please login/sign up first");
        }
        else {
            boolean pause = true;
            while (pause) {
                System.out.print("please enter username : ");
                String username = jin.next();
                if(username.equals(Main.myuser.getname())){
                    System.out.println("you cant un follow your self");
                    pause=false;
                }
                else {
                    int correct = 0;
                    for (int i = 0; i < Main.users.size(); i++) {
                        if (username.equals(Main.users.get(i).getname())) {
                            Main.myuser.unfollow(Main.users.get(i));
                            correct = 1;
                            pause = false;
                        }
                    }
                    if (correct == 0) {
                        System.out.println("This username does not exist");
                    }
                }
            }
        }
    }
}
