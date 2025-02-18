
package DangKhaiVy_30209244459;
import java.util.*;
import java.text.*;
public class PersonList {
    ArrayList<Person> people=new ArrayList<>();
    Scanner nhap = new Scanner(System.in);
    public void addP(){
        System.out.println("Hay nhap so nguoi hien co: ");
        int n=nhap.nextInt();
        nhap.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Hay nhap lua chon (student/teacher): ");
            String loai=nhap.nextLine();
            if(loai.equalsIgnoreCase("student")){
                Student myst=new Student();
                myst.addPerson();
                people.add(myst);
            }else if(loai.equalsIgnoreCase("teacher")){
                Teacher mytc=new Teacher();
                mytc.addPerson();
                people.add(mytc);
            }
        }
    }
    public void displayall(){
        for(Person ps: people){
            ps.display();
        }
    }
    public boolean deleteP(String id){
        for(Person myps: people){
            if(myps.getID(id).equalsIgnoreCase(id)){
                people.remove(id);
                return true;
            }
        }
        return false;
    }
    public boolean editP(String id){
        for(Person myps: people){
            if(myps.getID(id).equalsIgnoreCase(id)){
                myps.editPerson();
                return true;
            }
        }
        return false;
    }
}
