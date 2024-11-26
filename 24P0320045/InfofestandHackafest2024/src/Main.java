/*
seat Number: 24P0320045
Description:This a Infofest and Hackafest Events System Management Its a Menu-driven program.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        InfoFest_Management system = new InfoFest_Management();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Infofest&Hackafest_Management_System");
            System.out.println("\n1.Add Registeration");

            System.out.println("\n2.Add Volunteers");
            System.out.println("\n3.Add Events");
            System.out.println("\n4.View Registrations");
            System.out.println("\n5.View Volunteers");
            System.out.println("\n6.View Events");
            System.out.println("\n7.Exit");
            System.out.println("Enter Your Choice:");
            choice=system.sc.nextInt();

            switch (choice){
                case 1:system.addRegistration();
                break;

                case 2:system.addVolunteers();
                break;

                case 3:system.addEvents();
                break;

                case 4:system.registrationDisplay();
                break;

                case 5:system.volunteersDisplay();
                break;

                case 6:system.eventDisplay();
                break;

                case 7:System.out.println("Exiting.....!");
                break;

                default:
                    System.out.println("Invalid Option Try Again");
            }

        }while (choice != 7);
    }
}