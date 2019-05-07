import java.util.Scanner;

public class Bio {
    public static void bio(){
        System.out.print("Please enter your Bio : ");
        Scanner jin=new Scanner(System.in);
        String bio=jin.nextLine();
        Main.myuser.setBio(bio);
    }
}
