package Model;
import Utils.LinkedListOrdered;

public class UserList extends LinkedListOrdered {
    private static LinkedListOrdered<User> users = new LinkedListOrdered<>();
    public static LinkedListOrdered <User> getUsers(){
        return users;
    }
    public static void setUsers(LinkedListOrdered<User> users){
        UserList.users = users;
    }
}
