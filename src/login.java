import java.util.Scanner;

public class login {

    public static void In(){
        Scanner jin = new Scanner(System.in);
        String username;
        String password;
        int flag=0;
        boolean pause=true,close=true;
        if(Main.myuser!=null){
            System.out.println("you are already loged in");
        }
        else {
            while (pause) {
                if (flag == 1) {
                    System.out.println("your username is un correct");
                }
                System.out.println("Please enter your username");
                System.out.print("Username : ");
                username = jin.next();
                for (int i = 0; i < Main.users.size(); i++) {
                    if ((Main.users.get(i).getname().equals(username))) {
                        pause = false;
                        flag = 0;
                        System.out.println("Please enter your password");
                        System.out.print("password : ");
                        while (close) {
                            password = jin.next();
                            if (Main.users.get(i).getpass().equals(password)) {
                                close = false;
                                System.out.println("You entered your account Successfully");
                                Main.myuser = Main.users.get(i);
                                break;
                            } else {
                                System.out.println("Wrong Password");
                            }
                        }
                        break;
                    }
                }
            }
        }
    }
}
