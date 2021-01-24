/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matbreak;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class MATBREAK {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long mul = 2, b = 0;
            int sum = 0; 
            int n = scan.nextInt();
            int a = scan.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < ((2 * i) - 1); j++) {
                    mul = b % 1000000007 * a % 1000000007;
                    b = mul;
                    mul = mul % 1000000007;
                }
                sum = (int) (sum + mul);
                a = (int) (mul * a % 1000000007);
                b = a;
            }
            System.out.println(sum % 1000000007);
        }
    }
}
