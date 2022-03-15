package happyUserProject;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {

    public List<User> registerUser (List<User> userList){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter user name");
        User user = new User(scan.nextLine(), LocalTime.now());
        userList.add(user);
        return userList;
    }

    public void findHappyUser (List<User> userList){
        for (User each: userList) {
            if(each.registerTime.getSecond()<10){
                System.out.println( each.userName + " you are lucky man!!!!!");
            }else{
                System.out.println( each.userName + " ooh boy you are not lucky");
            }
        }
    }
    public void printUserList(List<User> userList){
        for ( User each: userList) {
            System.out.println(each.userName + " " + " Register time :" + each.registerTime);
        }
    }

}
