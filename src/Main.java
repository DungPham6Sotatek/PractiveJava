import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] clubs = {"MU", "Liverpool", "Mancity"};
        int i;
        for (i = 0; i < clubs.length; i ++ ) {
            System.out.println(clubs[i]);
        }

        int [] number = {15,2,5,3,7,20,6};
        for (int k = 0; k < number.length -1; k++ ) {
            for (int e = k +1 ; e < number.length; e++) {

                if(number[k] < number[e]) {
                    int temp = number[k];
                    number[k] = number[e];
                    number[e] = temp;
                }
            }


        }
        System.out.println("MANG SAP XEP" + Arrays.toString(number));

    }
}