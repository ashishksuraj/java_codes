/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chefstr1;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class CHEFSTR1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0) {            
            int n = scan.nextInt();
            long sum=0;
            int[] inp = new int[n];
            for (int i = 0; i < n; i++) {
                inp[i] = scan.nextInt();
                if (i!=0) {
                    sum += (Math.abs(inp[i]-inp[i-1]) - 1);
                    //System.out.println(sum);
                }
            }
            System.out.println(sum);
        }
    }
    
}
