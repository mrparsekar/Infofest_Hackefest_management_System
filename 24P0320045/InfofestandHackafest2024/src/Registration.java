/*
Seat No:24P0320045
description:This is a sub class which inherits the properties of Person class.This class handles the registerations.
 */

public class Registration extends Person {    // this will impose the values of Person that is Abstract class as parent class
    private String collegename;

    public Registration(String name,int age,int contact,String collegename){
        super(name,age,contact);
        this.collegename=collegename;
    }
    private String getCollegename(){
        return collegename;
    }

    public void displaydetails(){
        System.out.println("Student Name: "+getName());
        System.out.println("Student Age: "+getAge());
        System.out.println("Student Contact: "+getContact());
        System.out.println("Student CollegeName: "+getCollegename());
    }
}
