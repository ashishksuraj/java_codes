/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chfnswps;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class CHFNSWPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0) {            
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                b[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    
                }
            }
        }
    }
    
}
