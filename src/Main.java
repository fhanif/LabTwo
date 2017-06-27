import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String keepGoing = "";
        System.out.println("Enter your name:");
        Scanner scnr = new Scanner(System.in);
        String name = scnr.next();
        scnr.nextLine(); //for cleaning out scanner

        do {
            System.out.println("Enter an integer between 1 and 100:");
            int userInput = scnr.nextInt();

            while (userInput <= 1 || userInput >= 100) {
                System.out.println(name + ", you entered a number NOT between 1 and 100. Enter an integer in the correct range.");
                userInput = scnr.nextInt(); //validation for positive integer
            }

            if (userInput % 2 != 0) {
                System.out.println(userInput + " Odd");
            } else if ((userInput % 2 == 0) && (userInput >= 2 && userInput <= 25)) {
                System.out.println("Even and less than 25");
            } else if ((userInput % 2 == 0) && (userInput >= 26 && userInput <= 60)) {
                System.out.println("Even");
            } else if (userInput % 2 == 0 && userInput > 60) {
                System.out.println(userInput + " Even");
            } else if (userInput % 2 != 0 && userInput > 60) {
                System.out.println(userInput + " Odd and over 60.");
            }
            System.out.println(name + ", do you want to continue? (y/n): ");
            scnr.nextLine();
            keepGoing = scnr.next();
        } while (keepGoing.equals("y") || keepGoing.equals("Y") && (keepGoing != "N") && (keepGoing != "n"));
        //used do while loop for ending program
    }
}
//how to validate if its an integer or not?
//always use a do while loop for ending/continuing program???