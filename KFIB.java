package kfib;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class KFIB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        int n = scan.nextInt();
        int k = scan.nextInt();
        long[] input = new long[n];
        for (int i = 1; i <= n; i++) {
            if (i <= k) {
                input[i - 1] = 1;
            } else {
                for (int j = i - 2; j >= i - k-1; j--) {
                    sum += input[j];
                }
                input[i-1]= sum;
                sum=0;
            }
        }
        System.out.println(Arrays.toString(input));
    }

}
