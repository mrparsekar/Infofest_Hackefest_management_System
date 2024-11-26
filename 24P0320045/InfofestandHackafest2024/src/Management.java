/*
seat Number: 24P0320045
Description:This is a generic class with Arraylist added to store the data of user and also generic function is created to display the details.
 */
import java.util.ArrayList;
//this is generic class
class Management<T> {

    //Array list is created
    private ArrayList<T> list = new ArrayList<T>();

    public void add(T item){
        list.add(item);
    }

    private ArrayList<T> getList(){
        return list;
    }

    //this is generic function
    public void displayList(){
        for (T item : list){
            if (item instanceof Person){
                ((Person) item).displaydetails();
                System.out.println();
                }
            }
        }
    }

