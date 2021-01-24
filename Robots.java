/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robots;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class Robots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum1 = 0, sum2 = 0;
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum1 += a[i];
            sum2 += b[i];
        }
       // System.out.println(sum1 +"\n"+ sum2);
        if (sum1 == 0 && sum2 == 0) {
            System.out.println("-1");
        } else if (sum1 == n && sum2 == n) {
            System.out.println("-1");
        } else if (sum2 - sum1 == 1) {
            System.out.println("3");
        } else// (sum2 - sum1 > 1) {
        {
            System.out.println(sum2 - sum1);
        }
    }
}
