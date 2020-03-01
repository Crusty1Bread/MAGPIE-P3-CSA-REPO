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
                System.out.println("HELP:\nI am the Magpie virtual assistant, here to help you with your STEM information needs!\n\nHere are some topics I am able to cover:\n1.) Class Summaries and Descriptions\n2.) Schedule Questions and Period Times\n3.) STEM Class Locations\n4.) Teacher communication information\n\nI am still learning so please bare with my options for now!\nTo exit help, please respond with \"Ok\" or \"Bye\".\nFor further information please respond with \"Explain \" and the number associated with each topic.");

                ans = scan.nextLine();
                ans = ans.toLowerCase();
                ans = ans.replaceAll("\\s", "");

                if (ans.equals("ok") || ans.equals("bye")) {
                    break;
                } if (ans.equals("explain1")) {
                    System.out.println("\nThis will give you information about what a certain class is or about.\n\nEXAMPLE:\n\">AP Computer Science A\"\n\"This is a course where you will learn about the writing of Java programs in preparation for the AP exam\"\n");
                } if (ans.equals("explain2")){
                    System.out.println("\nThis will give you information about the school schedule and when certain events.\n\nEXAMPLE:\n\">Tuesday's Schedule\"\n\"On Tuesdays there is:\n\tZero Period: 6:30 - 7:32\n\tFirst Period: 7:40 - 9:41\n\tThird Period: 9:49 - 10:49\n\tLunch: ...\"\n");
                }
            }
        } else {
            System.out.println("Could you please repeat that?");
        }
    }
}