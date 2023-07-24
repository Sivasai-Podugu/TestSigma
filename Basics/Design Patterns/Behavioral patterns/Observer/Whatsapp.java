package Observer;

import java.util.List;
import java.util.ArrayList;

public class Whatsapp {
    private List<User> group = new ArrayList<>();
    private String recentMsg;
    private String groupName;
    Whatsapp(String groupName){
        this.groupName = groupName;
    }
    
    public void addUser(User user){
        group.add(user);
    }

    public void removeUser(User user){
        group.remove(user);
    }

    public void notifyUsers(){
        System.out.println("A new message in "+ groupName+" group");
        for (User user : group) {
            user.update(recentMsg);
        }
    }

    public void setRecentMsg(String recentMsg){
        this.recentMsg = recentMsg;
        notifyUsers();
    }
}
