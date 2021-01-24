/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replacing.elements;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class ReplacingElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int d = scan.nextInt();
            int[] a = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (a[i] <= d) {
                    count++;
                }
            }
            Arrays.sort(a);
            if (count == n) {
                System.out.println("YES");
            } else {
                if (a[0] + a[1] <= d) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

}
