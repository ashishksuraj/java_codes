/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class Covid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int b = 0;
            int[] x = new int[n];
            int[] front = new int[n - 1];
            for (int i = 0; i < n-1; i++) {
                x[i] = scan.nextInt();
                if (i!=0) {
                    if (x[i]-x[i-1]<=2) {
                        front[b]++;
                    }
                    else b++;
                }
            }
            System.out.println(Arrays.toString(front));
        }
    }

}
