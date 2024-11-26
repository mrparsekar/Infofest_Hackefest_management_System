/*
seat Number: 24P0320045
Description:This is a sub class which inherits the properties of Person class.This class handles the Volunteers.
 */
public class Volunteers extends Person {
    private String role;

    public Volunteers(String name, int age, int contact, String role){
        super(name,age,contact);
        this.role=role;
    }

    private String getRole(){
        return role;
    }
    public void displaydetails(){
        System.out.println("Volenteer Name: "+getName());
        System.out.println("Volenteer Age: "+getAge());
        System.out.println("Volenteer Contact: "+getContact());
        System.out.println("Volenteer Role: "+getRole());
    }
}
