
package OOP.Person2;
import java.util.*;
import java.text.*;
public class PersonList {
    Scanner nhap=new Scanner(System.in);
    ArrayList<Person> people = new ArrayList<>();
    public void addPP(){
        System.out.println("Hay nhap so nguoi trong truong: ");
        int n=nhap.nextInt();
        nhap.nextLine();
        for(int i=0;i<n;i++){
            Person myPerson=new Person();
            myPerson.addPerson();
            people.add(myPerson);
        }
    } 
    public boolean deleteP(String id){
        for(int i=people.size()-1;i>=0;i++){
            if(people.get(i).getId().equalsIgnoreCase(id)){
                people.remove(i);
                return true;
            }
        }
        return false;
    }
    public void editP(String id){
        for(Person myps: people){
            if(myps.getId().equalsIgnoreCase(id)){
                myps.editPerson();
                System.out.println("Da xoa.");
            }
        }
    }
    public void displayall(){
        for(Person myps: people){
            myps.display();
        }
    }
}
