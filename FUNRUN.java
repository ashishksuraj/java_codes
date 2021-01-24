/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funrun;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class FUNRUN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int m = 0, k = 0, maxa = 0, maxb = 0;
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
            maxa = a[0];
            maxb = b[0];
            for (int i = 0; i < n; i++) {
                if (maxa < a[i]) {
                    maxa = a[i];
                }
                if (maxb < b[i]) {
                    maxb = b[i];
                }
            }
          /*  System.out.println(maxa+" "+maxb);
            for (int i = 0; i < n; i++) {
                if (b[i] > a[i]) {
                    m += 1;
                }
                if (b[i] < a[i]) {
                    k += 1;
                }
            }
            //System.out.println(m);
            if (m == n || k == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }*/
            if (maxa==maxb) {
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }

}
