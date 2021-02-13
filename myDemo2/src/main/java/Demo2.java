import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        String menu="";
        String choice,choice2;
        double nomeat=7.5;
        double beef=25.5;
        double pork=17.5;
        double fees=5;
        double tips=0;
        double amount=0;
        int input;
        boolean morefood=true;

        System.out.println("");
        System.out.println("*********************************************");
        System.out.println("   Welcome to Online Order Program ");
        System.out.println("*********************************************");
        System.out.println("1.Hamburger ");
        System.out.println("2.Pizza");
        System.out.println("3.Noodle ");
        System.out.println("4.Salad ");
        System.out.println("5.Sandwich ");
        System.out.println("6.Exit ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++ ");
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        do{

            System.out.print("Please enter your choice(1-6)：");
            input = sc.nextInt();
            System.out.println("");

            switch(input) {
                case 1:
                    menu="Hamburger";
                    break;
                case 2:
                    menu="Pizza";
                    break;
                case 3:
                    menu="Noodle";
                    break;
                case 4:
                    menu="Salad";
                    break;
                case 5:
                    menu="Sandwich";
                    break;
                case 6:
                    System.out.println("");
                    System.out.println("Your choice is: Finish the order!");
                    morefood=false;
                    continue;

                default:
                    System.out.println("");
                    System.out.println("That is wrong input. Please try again!");
                    continue;
            }

            System.out.println("Your choice is:   "+menu);
            System.out.print("Would you like to have some meat on your "+menu+"?: ");
            choice=sc.next();
            System.out.println("");

            if(choice.toLowerCase().equals("yes")) {

                System.out.print("Beef or Pork?:");
                choice2=sc.next();
                System.out.println("");

                switch(choice2.toLowerCase())
                {

                    case "beef":
                        amount+=beef;
                        break;

                    case "pork":
                        amount+=pork;
                        break;

                    default:
                        System.out.println("That is wrong input. Please try again!");
                        continue;

                }

                //choose no meat
            }else {
                amount+=nomeat;
                System.out.println("your choice is without meat");
            }
            //System.out.println("");
            System.out.print("would you like to have more food?:");
            String more=sc.next();

            if (more.toLowerCase().equals("no"))
            {
                morefood=false;

            }

        }while(morefood);
        {
            if(amount==0) {
                System.out.println("");
                System.out.println("No need to pay the delivery fee. ");


            }else {
                if (amount<50) {
                    System.out.println("");
                    System.out.println("The total price is less than $50. You need to pay the delivery fee $5.");
                    amount+=fees;
                }
                System.out.println("");
                System.out.print("would you like to pay some tips? Please enter the amount:");
                tips=sc.nextDouble();
                amount+=tips;

            }
            System.out.println("");
            System.out.println("The total price is "+amount);
            System.out.println("");
            System.out.print("Thank you for using Online Order Program");
            sc.close();

        }

    }

}
