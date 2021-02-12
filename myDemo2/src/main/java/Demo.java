import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String username,lastname, firstname,X;
        int userid;
        double score;
        boolean ifExit=true;
        String Exit;
        Scanner scanner;


        System.out.println("*********************************************");
        System.out.println("   Welcome to Grading System Program ");
        System.out.println("*********************************************");
        System.out.println(" ");

        do {
            scanner = new Scanner(System.in);
            System.out.print("Enter your name(Lastname,Firstname) : ");

            username=scanner.nextLine();
            String[] split = username.split(",");
            lastname=split[0];
            firstname=split[1];
            //System.out.println(split[0]+" "+split[1]);

            while (true) {
                System.out.print("Enter your ID(7 digits) : ");
                userid=scanner.nextInt();
                if((""+userid).length()==7) break;
            }


            while (true) {
                System.out.print("Enter your score: ");
                score = scanner.nextDouble();

                if (score >= 0  && score <= 100)

                    break;
            }

            System.out.println(firstname+" "+lastname+" got "+score);


            if(score>=80) {
                X="A! Congratulations!";
            } else if(score>=70 && score<80) {
                X="B! You are so close to A!";
            } else if(score>=60 && score<70) {
                X="C! You can do better by more practice!";
            } else {
                X="FNS! Please work harder to pass the course!";
            }

            System.out.println("Based on the grading system, "+firstname+"("+userid+") will probably get "+X);

            System.out.print("Exit the Program?(enter Yes to Exit): ");
            Exit=scanner.next();

            if (Exit.toLowerCase().equals("yes"))
            {
                ifExit=false;

            }

        }while(ifExit);
        {
            scanner.close();
            System.out.println("Thank you for using Grading System Program!");
        }
    }

}
