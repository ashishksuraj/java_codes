/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcm;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class LCM {

    static int lcm(int a, int b) {
        return (a / __gcd(a, b) * b);
    }

    static int __gcd(int a, int b) {
        return b == 0 ? a : __gcd(b, a % b);
    }

    static int findNums(int x) {
        int ans = -1;
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0 && lcm(i, x / i) == x) {
                ans = i;
            }
        }
        System.out.print(ans + " " + (x / ans));
        return ;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
               System.out.println(findNums(b));
        }
    }

}
