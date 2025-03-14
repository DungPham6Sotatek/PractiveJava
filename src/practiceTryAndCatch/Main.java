package practiceTryAndCatch;

import practiceInterface.Student;
import practiceNew.SinhVien;

import java.util.Scanner;

public class Main {
    public static int nhapMSV() {
        Scanner sc = new Scanner(System.in);
        int result;
        while (true) {
            System.out.print("Enter MSV: ");
            try  {
                result = sc.nextInt();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhap vao so nguyen");
                sc.nextLine();
            }
        }

        return result;
    }
    public static String nhapHoVaTen() {
        Scanner sc = new Scanner(System.in);
        String hoVaTen;
        while (true) {
            System.out.print("Enter hoVaTen: ");
            try {
                hoVaTen = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Nhap vao chu");
                sc.nextLine();
            }
        }

        return hoVaTen;
    }

    public static void main(String[] args) {
       int maSV = nhapMSV();
       String hoVaTen = nhapHoVaTen();
       SinhVienNew st1 = new SinhVienNew(maSV, hoVaTen, 9, 30);
       System.out.println(st1);
    }
}
