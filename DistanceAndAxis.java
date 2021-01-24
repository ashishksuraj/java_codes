/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance.and.axis;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class DistanceAndAxis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        long start = 0, end =0 ;
        int t = scan.nextInt();
        while (t-->0) {            
            int n = scan.nextInt();
            int k = scan.nextInt();
            start = System.currentTimeMillis();
            if ((n%2==0 && k==0) || (n==0 && k==0)) {
                System.out.println("0");
            }
            else System.out.println(Math.abs(n-k));
            end = System.currentTimeMillis();
        }
                    System.out.println("time is "+(end - start));
    }
    
}
