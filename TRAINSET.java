/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainset;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ashish
 */
public class TRAINSET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Stack<String> str = new Stack<String>();
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            System.err.println(n);
            String[] string = new String[n];
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                System.err.println(i);  
                str.push(scan.nextLine());
               // num[i] = scan.nextInt();
            }
            System.out.println(str);
        }
    }

}
