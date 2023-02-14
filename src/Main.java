import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        User user=new User(2005,"Aibek",17);
        User user1=new User(2001,"Meder",22);
        User user2=new User(2006,"Malike",16);
        ArrayList<User>users= new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        UserDao userDao=new UserDao();
        userDao.Users(user1);
        System.out.println(userDao.searchById(2001));


    }
}