/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef1;
//import java.util.*;
//import java.lang.*;
//import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class Codechef1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int c=0;
        while(t!=0){
            int n = scan.nextInt();
            int k = scan.nextInt();
            //int c;
            int[] a = new int[n];
            //a[n-1]=0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                c = a[i]%k;
               // System.err.println("g");
                if((i+1)!=n){
                    a[i+1] += c;
                    //System.err.println("h");
                }
            }
            System.out.println(c);
            t--;
        }
    }
    
}
