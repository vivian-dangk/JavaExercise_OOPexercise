
package OOP.Person2;
import java.util.*;
import java.text.*;
public class Person {
    Scanner nhap=new Scanner(System.in);
    private String ID;
    private String homeTown;
    private Date dateBirth;
    private SimpleDateFormat bd = new SimpleDateFormat("dd/MM/yyyy");
    public Person(String ID, String homeTown, Date dateBirth){
        this.ID=ID;
        this.dateBirth=dateBirth;
        this.homeTown=homeTown;
    }
    public Person(){
    }
    public String getId(){
        return ID;
    }
    public void setDate(Date dateBirth){
        this.dateBirth=dateBirth;
    }
    public void setHome(String homeTown){
        this.homeTown=homeTown;
    }
    public void addPerson(){
        System.out.println("Hay nhap ID: ");
        this.ID=nhap.nextLine();
        System.out.println("Hay nhap que quan: ");
        this.homeTown=nhap.nextLine();
        while(true){
            try{
            System.out.println("Hay nhap ngay thang nam sinh: ");
            this.dateBirth=bd.parse(nhap.nextLine());
            break;
            }catch(ParseException e){
            System.out.println("Nhap sai, hay nhap lai!!!");
            }
        }
    }
    public void display(){
        System.out.println("ID: "+ID+", que quan: "+homeTown+", ngay thang nam sinh: "+bd.format(dateBirth));
    }
    public boolean editPerson(){
        System.out.println("Hay nhap que quan moi: ");
        this.homeTown=nhap.nextLine();
        try{
            System.out.println("Hay nhap ngay thang nam sinh moi: ");
            this.dateBirth=bd.parse(nhap.nextLine());
        }catch(ParseException e){
            System.out.println("Nhap sai hay nhap lai: ");
            this.dateBirth = new Date();
        }
        return true;
    }
}
class Student extends Person{
    private String major;
    public Student(String ID, String homeTown, Date dateString, String major){
        super(ID, homeTown, dateString);
        this.major=major;
    }
    public Student(){
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Nganh hoc la: "+major);
    }
    @Override
    public void addPerson(){
        super.addPerson();
        System.out.println("Hay nhap nganh hoc: ");
        this.major=nhap.nextLine();
    }
    @Override
    public boolean editPerson(){
        super.editPerson();
        System.out.println("Hay nhap nganh hoc moi: ");
        this.major=nhap.nextLine();
        return true;
    }
}
class Teacher extends Person{
    private String department;
    public Teacher(String ID, String homeTown, Date dateBirth, String department){
        super(ID, homeTown, dateBirth);
        this.department=department;
    }
    public Teacher(){
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Khoa giang day: "+department);
    }
    @Override
    public void addPerson(){
        super.addPerson();
        System.out.println("Hay nhap khoa dang day: ");
        this.department=nhap.nextLine();
    }
    @Override
    public boolean editPerson(){
        super.editPerson();
        System.out.println("Hay nhap khoa moi: ");
        this.department=nhap.nextLine();
        return true;
    }
}
