/*
seat Number: 24P0320045
Description:This is a base class whose properties are inherited
 */
abstract class Person {
    private String name;
    private int age;
    private int contact;

    public Person(String name,int age,int contact){
        this.name=name;
        this.age=age;
        this.contact=contact;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public int getContact(){
        return contact;
    }

    public void displaydetails(){

    }
}
