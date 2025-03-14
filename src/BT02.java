import java.util.Scanner;

public class BT02 {
    // Nhập vào 1 số in ra bảng cửu chương
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println("bảng cửu chương của " + number + " là: " + number + " x " +i + " = " + number *i);
        }
    }
}
