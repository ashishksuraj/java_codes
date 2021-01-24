/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsell;

import java.util.Arrays;
import java.util.Scanner;

public class CARSELL {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long sum = 0;
        int j = 0;
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] inp = new long[n];
            for (int i = 0; i < n; i++) {
                inp[i] = scan.nextLong();
            }
            Arrays.sort(inp);
            for (int i = n - 1; i >= 0; i--) {
                if (inp[i] - j > 0) {
                    sum += (inp[i] - j);
                }
                j++;
            }
            // System.out.println(Arrays.toString(inp));
            System.out.println(sum % 1000000007);
            sum = 0;
            j = 0;
        }
    }
}
