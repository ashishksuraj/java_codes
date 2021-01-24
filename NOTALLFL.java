/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notallfl;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class NOTALLFL {

    /**
     * @param args the command line arguments
     */
    public int check(int[] cake, int n) {
        //int[] cake = new int[n];
        int[] lm = new int[n];
        int m = 0, l = 0, q = 0;
        for (int i = 0; i < n; i++) {
            if (cake[i] == 1) {
                l = 0;
                m = m + 1;
                if (l < m && i != n - 1) {
                    l = 0;
                }
                lm[q] = m;
                q++;
            } else {
                m = 0;
                l = l + 1;
                if (l > m && i != n - 1) {
                    m = 0;
                }
                lm[q] = l;
                q++;
            }
            int max = lm[0];
            for (int y = 1; y < n; y++) {
                if (lm[i] > max) {
                    max = lm[i];
                }
                //return max;
            }
            //System.out.println(max);
        } 
        return max;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            //Arrays.fill(lm,0);
            int sum = 0;
            for (int i = 0; i < n; i++) {
                cake[i] = scan.nextInt();
                sum += cake[i];
            }
            if (sum == n || sum == n * 2) {
                System.out.println(n);
            } else {

            }
            /* if (m>l) {
                   System.out.println(m);
               }
               else System.out.println(l);
            }
            System.out.print(m+" "+l+"\n");
            System.out.println(Arrays.toString(lm));*/
        }
    }

}
