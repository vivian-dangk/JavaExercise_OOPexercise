
package OOP.Person2;
import java.util.*;
import java.text.*;
public class Processor {
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        PersonList myps=new PersonList();
        while(true){
            System.out.println("Hay chon yeu cau: ");
            System.out.println("1. Nhap thong tin.");
            System.out.println("2. In thong tin.");
            System.out.println("3. Thay doi thong tin.");
            System.out.println("4. Xoa.");
            System.out.println("5. Thoa.");
            int chon=nhap.nextInt();
            nhap.nextLine();
            switch (chon){
                case 1: 
                    myps.addPP();
                    break;
                case 2:
                    myps.displayall();
                    break;
                case 3:
                    System.out.println("Hay nhap ID muon thay doi: ");
                    String ID=nhap.nextLine();
                    myps.editP(ID);
                    break;
                case 4:
                    System.out.println("Hay nhap ID muon xoa: ");
                    String id=nhap.nextLine();
                    if(myps.deleteP(id)){
                        System.out.println("Da xoa.");
                    }else{
                        System.out.println("Khong tim thay ID.");
                    }
                    break;
                case 5:
                    System.out.println("Dang thoat..............");
                    System.out.println("Bye!!!!!");
                    break;
                default: 
                    System.out.println("Khong hop le.");
                    break;
            }
            if(chon==5){
                break;
            }
        }
    }
}
