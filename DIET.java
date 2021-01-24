/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diet;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class DIET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            long s = 0;
            int b = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                s += a[i];
                if (s / (k * (i + 1)) == 0) {
                    System.out.println("NO " + (i + 1));
                    break;
                }
                b++;
            }
            if (b == n) {
                System.out.println("YES");
            }
        }
    }

}
