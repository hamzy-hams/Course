package pasd5;
import java.util.Scanner;


public class faktorial_12 {
    
    static int faktorial_bf(int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= (i + 1);
        }
        return result;
    }

    static int faktorial_dq(int n) {
        if (n <= 1) {
            return 1;
        } else {
            int result = n * faktorial_dq(n - 1);    
            return result;
        }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai n: ");
        
        int n;
        n = input.nextInt();
        int bf = faktorial_bf(n);
        int dq = faktorial_dq(n);
        System.out.println("output dari bf: " + bf);
        System.out.println("output dari dq: " + dq);
    }
}
