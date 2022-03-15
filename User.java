package happyUserProject;

import java.time.LocalTime;

public class User {
    String userName ;
    LocalTime registerTime ;

    public User(){

    }
    public User (String userName , LocalTime registerTime){
        this.userName = userName;
        this.registerTime = registerTime;
    }
}
