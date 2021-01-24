/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg638;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int sum1=0;
            int[] sq = new int[n];
            for (int i = 0; i < n; i++) {
                sq[i] = (int) Math.pow(2, i + 1);
                sum1 += sq[i];
            }
            int a=n-2,sum2=0;
            for (int i = 0; i < n / 2; i++) {
                sum2 += sq[a];
                a--;
            }
            System.out.println(sum1-sum2*2);
        }
    }

}
