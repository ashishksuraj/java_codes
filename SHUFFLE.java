/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shuffle;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class SHUFFLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0) {            
            int n = scan.nextInt();
            int k = scan.nextInt();
            int pq=0;
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                b[i]=a[i];
            }
            Arrays.sort(a);
                for (int j = 0; j < n; j++) {
                    int c = a[j];
                    for (int l = 0; l < n; l++) {
                        if (b[l]==c) {
                            if ((l-j)%k==0) {
                                pq++;
                            }
                        }
                    }
                }
            //System.out.println(Arrays.toString(diff));
            if (pq==n) {
                System.out.println("yes");
            }
            else System.out.println("no");
            //System.out.println(Arrays.toString(a));
            //System.out.println(Arrays.toString(b));
        }
    }

}
