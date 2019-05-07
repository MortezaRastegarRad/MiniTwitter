import java.util.Scanner;

public class signup {

    public static void Sign(){
        if(Main.myuser != null){
            System.out.println("please log out first ");
        }
        else {
            String username = "";
            String password;
            Scanner jin = new Scanner(System.in);
            boolean pause = true;
            while (pause) {
                System.out.println("Please enter your username");
                System.out.print("Username : ");
                username = jin.nextLine();
                if (username.equals("")) {
                    System.out.println("Please enter another name");
                    continue;
                }
                pause = false;
                for (int i = 0; i < Main.users.size(); i++) {
                    if (Main.users.get(i).getname().equals(username)) {
                        System.out.println("Please enter another name");
                        pause = true;
                        break;
                    }
                }
            }
            boolean close = true;
            while (close) {
                System.out.println("Please enter your password");
                System.out.print("Password : ");
                password = jin.nextLine();
                if (password.equals("")){
                    System.out.println("please enter another password");
                    continue;
                }
                User user = new User(username, password);
                Main.users.add(user);
                Main.myuser = user;
                System.out.println("You are registered ");
                close=false;
            }
        }
    }

}
