package csci.assignment2;

import java.util.Scanner;

/*
Christopher Vanderlois
CSCI 3250-03
09/30/2026
A program that allows the user to buy tickets for a train. Prints the information
of each wagon on the train displaying the capacity and the current
number of tickets bought for each wagon. Displays the wagon with
the least number of tickets bought.
 */
public class VanderloisAssignement2 {
    public static void main(String[] args) {
        System.out.println("Welcome to VanderloisExpress Transit System!");

        Train train1 = new Train(10, 100);

        Scanner keyboard = new Scanner(System.in);

        int choice = 0;

        while (choice != 4) {

            System.out.println("1. Buy a Ticket");
            System.out.println("2. Print all wagons information");
            System.out.println("3. Find the least crowded wagon");
            System.out.println("4. Quit");
            System.out.println("Choose an option from 1 to 4");

            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Wagon Number (1-10):");
                    int wagNum = keyboard.nextInt();
                    System.out.println("Number of tickets: ");
                    int ticNum = keyboard.nextInt();
                    train1.buyTicket(wagNum, ticNum);
                    break;
                case 2:
                    train1.display();
                    break;
                case 3:
                    int lessCrowded = train1.findLessCrowedWagon();
                    System.out.println("The least crowded wagon is: " + lessCrowded);
                    break;
                case 4:
                    System.out.println("Thank you for using the transit system.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option.");
                    break;
            }
        }
    }
}
