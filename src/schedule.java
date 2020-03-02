import java.util.*;
public class schedule extends response {
    public schedule(String ans) {
        Scanner scan = new Scanner(System.in);
        ans = scan.nextLine();
        ans = ans.toLowerCase();
        ans = ans.replaceAll("\\s", "");



            //Expecting a response related to period ending/start... so like "when does period 1 end?"
            if (ans.equals("period")) {
                if (ans.equals("end")) {
                    if (ans.equals("1")) {                  //period 1 end
                        System.out.println("What day is it today?");
                        ans = scan.nextLine();
                        if (ans.equals("monday")) {
                            System.out.println("Is it a Common day today?");
                            ans = scan.nextLine();
                            if (ans.equals("no")) {
                                System.out.println("Period 1 ends at 9:41");
                            } else if (ans.equals("yes")) {
                                System.out.println("Period 1 ends at 8:37");
                            }

                        }
                        if (ans.equals("tuesday")) {
                            System.out.println("Is it a Common day today?");
                            ans = scan.nextLine();
                            if (ans.equals("no")) {
                                System.out.println("There is no period 1 today");
                            } else if (ans.equals("yes")) {
                                System.out.println("Period 1 ends at 8:37");
                            }
                        }
                        if (ans.equals("wednesday")) {
                            System.out.println("Period 1 ends at 9:45");
                        }
                        if (ans.equals("thursday")) {
                            System.out.println("")
                        }
                    }
                }
                    if (ans.equals("start")) {

                    }

            }
        }
    }