/*
seat Number: 24P0320045
Description: So this class handles all the functions like addregistration,addVolunteers,addEvents and also display the added details.

 */
import java.util.Scanner;

public class InfoFest_Management {

    private Management<Registration> registrationManagement = new Management<>();
    private Management<Volunteers> volunteersManagement = new Management<>();
    private Management<Events> eventsManagement = new Management<>();


    Scanner sc = new Scanner(System.in);

    public void addRegistration(){
        try {
            System.out.println("\nEnter Name: ");
            String name = sc.next();
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            System.out.println("Enter Contact: ");
            int contact = sc.nextInt();
            System.out.println("Enter CollegeName: ");
            String cname = sc.next();
            registrationManagement.add(new Registration(name,age,contact,cname));
            System.out.println("Details Successfully Added...!");
        } catch (Exception e) {
            System.out.println("Error Adding Registration Data "+e.getMessage());
        }
    }

    public void addVolunteers(){
        try {
            System.out.println("\nEnter Name: ");
            String name = sc.next();
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            System.out.println("Enter Contact: ");
            int contact = sc.nextInt();
            System.out.println("Enter Role");
            String role = sc.next();
            volunteersManagement.add(new Volunteers(name,age,contact,role));
            System.out.println("Details Successfully Added...!");
        } catch (Exception e) {
            System.out.println("Error Adding Volunteer Data "+e.getMessage());
        }
    }

    public void addEvents(){
        try {
            System.out.println("\nEnter Event Name: ");
            String ename = sc.next();
            System.out.println("Enter Event Timings: ");
            String etime = sc.next();
            System.out.println("Enter Event Venue: ");
            String evenue =sc.next();
            System.out.println("Enter Event Deadline(1/2/3-Days)");
            int edeadline= sc.nextInt();
            eventsManagement.add(new Events(ename,etime,evenue,edeadline));
            System.out.println("Details Successfully Added...!");
        } catch (Exception e) {
            System.out.println("Error Adding Events Data "+e.getMessage());
        }
    }

    public void registrationDisplay(){
        System.out.println("<-------Registrations List------>");
        registrationManagement.displayList();
    }

    public void volunteersDisplay(){
        System.out.println("<-------Volunteers List------>");
        volunteersManagement.displayList();
    }

    public void eventDisplay(){
        System.out.println("<-------Events List------>");
        eventsManagement.displayList();
    }
}
