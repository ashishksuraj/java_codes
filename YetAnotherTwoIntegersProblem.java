/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yet.another.two.integers.problem;

import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long dif = Math.abs(a - b);
            if (dif < 10 && dif!=0) {
                System.out.println("1");
            } else {
                if (dif % 10 == 0) {
                    System.out.println(dif / 10);
                } else {
                    System.out.println((dif / 10) + 1);
                }
            }
        }
    }
}
