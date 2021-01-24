/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modefreq;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class MODEFREQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int k = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int max = 0;
            System.out.println(Arrays.toString(a));
            int[] frq = new int[10];
            for (int i = 0; i < n; i++) {
                frq[a[i] - 1]++;
                if (frq[a[i] - 1] > max) {
                    max = frq[a[i] - 1];
                }
            }
            Arrays.sort(frq);
            System.out.println(Arrays.toString(frq));
            int[] fr = new int[max + 1];
            for (int i = 0; i < 10; i++) {
                fr[frq[i]]++;
            }
            max = fr[1];
            int same = fr[1];
            int ref = 0;
            System.out.println(Arrays.toString(fr));
            for (int i = 1; i < fr.length; i++) {
                if (fr[i] > max) {
                    max = fr[i];
                    ref = i;
                }
                if (fr[i] == same) {
                    k++;
                }
            }
            if (k == fr.length - 1) {
                System.out.println("1");
            } else {
                System.out.println(ref);
            }
        }
    }
}
