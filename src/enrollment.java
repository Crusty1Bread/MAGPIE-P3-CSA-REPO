public class enrollment {
  public void enrollment() {


        System.out.println("what would you like to explore?");
        System.out.println("There are four main class in Estem." );
        System.out.println("Computer Science, Robotic, Contruction, Medical Terminology.");
        System.out.println("Choose one class for more information");

        Scanner scan = new Scanner(System.in);

        String enroll = scan.nextLine();
        enroll = enroll.toLowerCase();
        enroll = enroll.replace("\t", "");

        if (enroll.equals("computer science")) {
            System.out.println("There are two type of computer science in this ERHS, Ap Computer Science Principle and Ap Computer Science A");
        } else if (enroll.equals("robotic")){
            System.out.println("   ");
        } else if (enroll.equals("contruction")){
            System.out.println("   ");
        } else if (enroll.equals("Medical terminology")){
            System.out.println("   ");
        } else{
            return;
        }


    }
}
