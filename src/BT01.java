import java.util.Scanner;

public class BT01 {
//    Nhập 1 số nguyên từ bàn phím hiển thị kết quả số đấy là số nguyên tố hay không
    // so nguyen tố là số chia het cho 1 va chinh no toi da 2 uoc
    // dung vong lặp từ 2 đến Sô nguyen -1. Nếu số nguyên chia gết cho i => không la số nguyên tố
    //sử dụng toán tử % để biết co chia hết hay không
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number: ");
    int number = sc.nextInt();

    if(isPrime(number)) {
        System.out.println("Prime number");
    }else {
        System.out.println("Not prime number");
    }



}
    public static boolean isPrime(int number){
        if(number < 2){
            return false;
        }
        for(int i = 2; i < number -1; i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    }


