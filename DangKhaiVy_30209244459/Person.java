
package DangKhaiVy_30209244459;
import java.util.*;
import java.text.*;
public class Person {
    Scanner nhap=new Scanner(System.in);
    private String ID;
    private String homeTown;
    private Date dateBirth;
    private SimpleDateFormat bd=new SimpleDateFormat("dd/MM/yyyy");
    public Person (String ID, String homeTown, Date dateBirth){
        this.ID=ID;
        this.dateBirth=dateBirth;
        this.homeTown=homeTown;
    }
    public Person(){
    }
    public void sethomeTown(String homeTown){
        this.homeTown=homeTown;
    }
    public void setDate(Date dateBirth){
        this.dateBirth=dateBirth;
    }
    public String getID(String ID){
        return ID;
    }
    public void display(){
        System.out.println("ID: "+ID+", que quan: "+homeTown+", Ngay sinh: "+bd.format(dateBirth));
    }
    public void addPerson(){
        System.out.println("Hay nhap ID: ");
        this.ID=nhap.nextLine();
        System.out.println("Hay nhap que quan: ");
        this.homeTown=nhap.nextLine();
        try{
            System.out.println("Hay nhap ngay thang nam sinh: ");
            dateBirth=bd.parse(nhap.nextLine());
        }catch (ParseException e){
            System.out.println("Khong hop le, hay nhap lai!!!");
            dateBirth=new Date();
        }
   }
    public boolean editPerson(){
        System.out.println("Hay nhap que quan moi: ");
        this.homeTown=nhap.nextLine();
        try{
            System.out.println("Hay nhap ngay thang nam sinh moi: ");
            dateBirth=bd.parse(nhap.nextLine());
        }catch (ParseException e){
            System.out.println("Khong hop le, hay nhap lai!!!");
            dateBirth=new Date();
        }
        return true;
    }
}
class Student extends Person{
    private String major;
    public Student(String ID, String homeTown, Date dateBirth, String major){
        super(ID, homeTown, dateBirth);
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
        System.out.println("Khoa dang day la: "+department);
    }
    @Override
    public void addPerson(){
        super.addPerson();
        System.out.println("Hay nhap khoa dang giang day: ");
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