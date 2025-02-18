
package DangKhaiVy_30209244459;
import java.util.*;
import java.text.*;
public class Processor {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        PersonList myps=new PersonList();
        while(true){
            System.out.println("Hay chon cac tac vu sau: ");
            System.out.println("1. Nhap thong tin.");
            System.out.println("2. In thong tin.");
            System.out.println("3. Chinh sua thong tin bang ID.");
            System.out.println("4. Xoa thong tin bang ID.");
            System.out.println("5. Thoat.");
            int chon=nhap.nextInt();
            nhap.nextLine();
            switch (chon){
                case 1:
                    myps.addP();
                    break;
                case 2: 
                    myps.displayall();
                    break;
                case 3:
                    System.out.println("Hay nhap ID can chinh sua: ");
                    String id=nhap.nextLine();
                    myps.editP(id);
                    break;
                case 4:
                    System.out.println("Hay nhap ID can xoa: ");
                    String ID=nhap.nextLine();
                    myps.deleteP(ID);
                case 5:
                    System.out.println("Thoat.............");
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Khong co lua chon nay.");
            }
            if(chon==5){
                break;
            }
        }
    }
}
