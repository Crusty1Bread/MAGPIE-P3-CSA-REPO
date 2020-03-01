import java.util.*;

public class response {
    private boolean school;
    private boolean help;

    public  response() {
        school = false;
        help = false;
    }

    public void respond(String ans) {
        Scanner scan = new Scanner(System.in);

        //Makes the user's response lowercase for evaluation
        ans = ans.toLowerCase();


        if (ans.equals("school")) {
            school = true;
        } else if (ans.equals("hello") || ans.equals("hi") || ans.equals("hey")) {
            System.out.println("Hello :)\nWhat do you need help with?");
        } else if (ans.equals("help")) {
            help = true;
            while (help) {
                System.out.println("HELP:\nI am the Magpie virtual assistant, here to help you with your STEM information needs!\n\nHere are some topics I am able to cover:\n1.) Class Summaries and Descriptions\n2.) Schedule Questions and Period Times\n3.) STEM Class Locations\n\nI am still learning so please bare with my options for now!\nTo exit help, please respond with \"Ok\"\nFor further information please respond with \"Explain \" and the number associated with each topic.");

                ans = scan.nextLine();
                ans = ans.toLowerCase();

                if (ans.equals("ok") || ans.equals("bye")) {
                    break;
                } if (ans.equals("Explain 1")) {
                    System.out.println("This will give you information about what a certain class is or about.\n\nEXAMPLE\n\"Explain 1\"");
                }
            }
        } else {
            System.out.println("Could you please repeat that?");
        }
    }
}