/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divthree;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class DIVTHREE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long k = scan.nextLong();
            long d = scan.nextLong();

            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextLong();
            }
            if (n == 1 && (arr[0] < k)) {
                System.out.println("0");
            } else {
                long sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += arr[i];
                }
                long div = (int) (sum / k);
                if (div <= d) {
                    System.out.println(div);
                } else {
                    System.out.println(d);
                }
                //div = 0;
            }
        }
    }
}
