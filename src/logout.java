public class logout {

    public static void Out(){
        if(Main.myuser==null){
            System.out.println("please login/sign up first");
        }
        Main.myuser = null;
        System.out.println("You are out of account");
    }
}
