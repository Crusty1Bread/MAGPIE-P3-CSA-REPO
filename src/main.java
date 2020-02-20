import java.lang.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //This is the opening statement to the user. Helps the user understand the program.
        System.out.println("Hello! Welcome to Magpie, your Personal School Assistant!\nWhat can I do for you today? ");

        //I make an object referencing the "response" class.
        response r = new response();

        //Get the user's first answer.
        String ans = scan.nextLine();

        //This sets the answer to lowercase letters because then I can evaluate the string easier.
        ans = ans.toLowerCase();

        //This is the loop that continues to run the program until the user enters the key word
        //Thus ending the program and the loop
        while (!ans.equals("bye")) {
            r.respond(ans);
            ans = scan.nextLine();
            ans = ans.toLowerCase();
        }
    }
}