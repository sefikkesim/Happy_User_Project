package happyUserProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
    List<User> list = new ArrayList<>();
        Methods method = new Methods();
        boolean isExit = true;
        Scanner scan = new Scanner(System.in);
        while (isExit) {

            System.out.println(" Please choose what you want\n" +
                    " To register a new user press 1 \n" +
                    "To see the happy users press 2 \n" +
                    "To list all users press 3 \n" +
                    "To exist from program press 4 ");
            String answer = scan.next();

            switch (answer) {
                case "1":
                    method.registerUser(list);
                    break;
                case "2":
                    method.findHappyUser(list);
                    break;
                case "3":
                    method.printUserList(list);
                    break;
                case "4":
                    isExit = false;
                    break;
                default:
                    System.out.println("Please enter valid character");
                    break;
            }
        }
    }
}
