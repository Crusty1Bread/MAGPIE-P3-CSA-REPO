import java.util.*;

public class response {
    private boolean school;
    private boolean personal;

    public  response() {
        school = false;
        personal = false;
    }

    public void respond(String ans) {
        Scanner scan = new Scanner(System.in);

        //Makes the user's response lowercase for evaluation
        ans = ans.toLowerCase();

        //These set a boolean value true or false so that it triggers a certain loop
        if (ans.equals("school")) {
            school = true;
        } else if (ans.equals("personal")) {
            personal = true;
        } else if (ans.equals("hello") || ans.equals("hi") || ans.equals("hey")) {
            System.out.println("Howdy :)");
        } else {
            System.out.println("Could you please repeat that? ");
        }

        //This is an example of one of the topic loops
        //This one is for school related conversation
        while (school) {
            System.out.println("So how is school? ");
            ans = scan.nextLine();

            ans = ans.toLowerCase();

            if (ans.equals("good") || ans.equals("well")){
                System.out.println("That's good. I'm glad to hear it! ");
                ans = null;
                school = false;

            } else if (ans.equals("bad") || ans.equals("not good")){
                System.out.println("Oh! I'm sorry to hear that! I wish there was something I could do. Too bad I'm fake");
                ans = null;
                school = false;

            } else if (ans.equals("back")) {
                school = false;

            } else {
                System.out.println("Could you please repeat that? ");
            }
        }
    }
}