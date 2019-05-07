import java.io.Serializable;
import java.util.*;
public class User implements Serializable {
    private String username;
    private String password;
    private String Bio;

    ArrayList<tweet> tweets =new ArrayList<tweet>();
    ArrayList<User> followings = new ArrayList<User>();
    ArrayList<User> followers = new ArrayList<User>();


    public User(String name,String password){//object user
        username=name;
        this.password=password;
    }

    public void setname(String name) {
        username=name;
    }

    public String getname() {
        return this.username;
    }

    public void setpass(String pass){
        this.password=pass;
    }

    public String getpass(){
        return this.password;
    }
    public String getBio(){
        return this.Bio;
    }
    public void setBio(String bio){
        this.Bio=bio;
    }

    public void follow(User a) {//a ro follow mikone
        boolean flag=true;
        for (int i = 0; i < this.followings.size(); i++) {
            if (a.equals(Main.myuser.followings.get(i))) {
                flag = false;
                System.out.println("you've followed already");
                break;
            }
        }
        if (flag) {
            a.followers.add(this);
            this.followings.add(a);
        }
    }
    public void unfollow(User a){//a ro unfollow mikone
        boolean flag=true;
        for (int i=0 ; i<this.followings.size() ; i++){
            if(a.equals(this.followings.get(i))){
                this.followings.remove(i);
                a.delfol(this);
                flag=false;
                break;
            }
            if(flag){
                System.out.println("you must follow him/her first");
            }
        }

    }
    public void delfol(User b){
        for(int i=0;i<this.followers.size();i++){
            if(b.equals(this.followers.get(i))){
                this.followers.remove(i);
            }
        }
    }
    public  static void showprofile(User a){
        System.out.print("Username : ");
        System.out.println(a.getname());
        System.out.print("Bio : ");
        System.out.println(a.getBio());
        for(int i=0;i<a.tweets.size();i++){
            tweet.showtweet(a.tweets.get(i));//vaqty nemikhay extend kony az esm klasy k mikhay extend kony estefade kon bad . bad function morede nazar
        }
    }
    public  void setTweet(tweet t,User user){
        user.tweets.add(t);
    }
    public void deletTweet(tweet t){
        for (int i=0;i<tweets.size();i++) {
            if(t.equals(this.tweets.get(i))) {
                this.tweets.remove(i);
                break;
            }
        }
    }
    public void showfollowers(){
        if(Main.myuser==null){
            System.out.println("please login/sign up first");
        }
        if(followings.size()==0){
            System.out.println("You dont have follower");
        }
        for(int i=0;i<followers.size();i++){
            System.out.println(followers.get(i).getname());
        }
    }
    public void showfollowing(){
        if(Main.myuser==null){
            System.out.println("please login/sign up first");
        }
        if(followings.size()==0){
            System.out.println("You dont have following");
        }
        for(int i=0;i<followings.size();i++){
            System.out.println(followings.get(i).getname());
        }
    }

    @Override
    public boolean equals(Object obj){
        User user = (User) obj;
        if(this.getname().equals(user.getname())){
            return true;
        }
        return false;
    }
}