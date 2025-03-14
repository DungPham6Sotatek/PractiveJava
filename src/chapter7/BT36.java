package chapter7;

import java.util.Scanner;

public class BT36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter password: ");
        String password = sc.nextLine();

        if(name.equals("Dung") && password.length() >6) {
            System.out.println("Valid input");
        }
        sc.close();
    }
}
