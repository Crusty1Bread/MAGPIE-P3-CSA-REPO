public class enrollment {
    public void enrollment() {
        System.out.println("What would you like to explore?");
        System.out.println("There are four main class in Estem." );
        System.out.println("Computer Science, Robotic, Contruction, Medical Terminology.");
        System.out.println("Choose one class for more information:");

        Scanner scan = new Scanner(System.in);
        String enroll = scan.nextLine();
        enroll = enroll.toLowerCase();
        enroll = enroll.replace("\t", "");

        if (enroll.equals("computer science")) {
            System.out.println("There are two type of computer science in this ERHS,");
            System.out.println("1. Ap Computer Science Principle.");
            System.out.println( "2. Ap Computer Science A.");
            System.out.println("Choose one that your interest to learn more about:");

            int ACS = scan.nextInt();
            if(ACS == 1){
                System.out.println("In Ap Computer Science Principle you will learn how to use code.org to create a game or an app,");
                System.out.print("this class is little bit earier than Computer Science A.");
            }else {
                System.out.println("For Computer Science A, we use java language instead of the asistant blocks in code.org.");
            }
        } else if (enroll.equals("robotic")){
            System.out.println("In ");




        } else if (enroll.equals("contruction")){
            System.out.println("   ");




        } else if (enroll.equals("Medical terminology")){
            System.out.println("   ");




        } else{
            return;
        }



    }
}
