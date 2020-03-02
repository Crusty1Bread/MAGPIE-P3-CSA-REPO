import java.util.*;

public class response {
    private boolean help;
    private boolean schedule;

    public  response() {
        help = false;
        schedule = false;
    }

    public void respond(String ans) {
        Scanner scan = new Scanner(System.in);

        if (ans.equals("hello") || ans.equals("hi") || ans.equals("hey")) {
            System.out.println("Hello :)\nWhat do you need help with?");
        } else if (ans.equals("help")) {
            help = true;
            while (help) {
                System.out.println("HELP:\nI am the Magpie virtual assistant, here to help you with your STEM information needs!\n\nHere are some topics I am able to cover:\n1.) Class Summaries and Descriptions\n2.) Schedule Questions and Period Times\n3.) STEM Class Locations\n4.) Teacher communication information\n\nI am still learning so please bare with my options for now!\nTo exit help, please respond with \"Ok\" or \"Bye\".\nFor further information please respond with \"Explain \" and the number associated with each topic.");

                ans = scan.nextLine();
                ans = ans.toLowerCase();
                ans = ans.replaceAll("\\s", "");

                if (ans.equals("ok") || ans.equals("bye")) {
                    help = false;
                } if (ans.equals("explain1") || ans.equals("1explain")) {
                    System.out.println("\nThis will give you information about what a certain class is or about.\n\nEXAMPLE:\n\">AP Computer Science A\"\n\"This is a course where you will learn about the writing of Java programs in preparation for the AP exam\"\n");
                } if (ans.equals("explain2") || ans.equals("2explain")){
                    System.out.println("\nThis will give you information about the school schedule and when certain events.\n\nEXAMPLE:\n\">Tuesday's Schedule\"\n\"On Tuesdays there is:\n\tZero Period: 6:30 - 7:32\n\tFirst Period: 7:40 - 9:41\n\tThird Period: 9:49 - 10:49\n\tLunch: ...\"\n");
                } if (ans.equals("explain3") || ans.equals("3explain")) {
                    System.out.println("\nThis will give you information on where certain facilities are located in the STEM building.\n\nEXAMPLE:\n\">Where can I get lunch\"\n\"You can get lunch near the farthest end of the STEM building inside the cafeteria area.\"");
                } if (ans.equals("explain4") || ans.equals("4explain")) {
                    System.out.println("\nThis will give you contact information in order to communicate with certain teachers.\n\nEXAMPLE:\n\">What is Mr.Smith's email?\"\n\"You can contact Mr.Smith at 123456@cnusd.k12.ca.us.\"");
                }
            }
        } else if (ans.contains("schedule")) {
            schedule = true;
            while (schedule) {
                System.out.println("Would you like to talk about period scheduling?");
                ans =  scan.nextLine();
                ans = ans.toLowerCase();
                ans = ans.replaceAll("\\s", "");
                if (ans.equals("yes") || ans.equals("y") || ans.equals("yeah") || ans.equals("ye")) {
                    System.out.println("Cool, this worked!");
                } else if (ans.equals("no") || ans.equals("n") || ans.equals("nay")) {
                    System.out.println("Oh! I'm sorry about this!");
                    schedule = false;
                } else {
                    System.out.println("Could you please repeat that?");
                }
            }
        } else {
            System.out.println("Could you please repeat that?");

        }
    }
}