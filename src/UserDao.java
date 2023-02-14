import java.util.ArrayList;

public class UserDao {
    private ArrayList<User>users=new ArrayList<>();

    public void Users(User user) {
        users.add(user);
    }
   public  User searchById(int id){
        for (User u:users) {
            if(u.getId()==id){
               return u;
            }
        }
        return null;
    }

    public ArrayList<User> getUsers() {
        return users;
    }


}
