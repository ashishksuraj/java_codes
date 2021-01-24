/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairelct;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class FAIRELCT {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] nn = new int[n];
            int sum1 = 0, sum2 = 0;
            Integer[] mm = new Integer[m];
            for (int i = 0; i < n; i++) {
                nn[i] = scan.nextInt();
                sum1 += nn[i];
            }
            Arrays.sort(nn);
            for (int i = 0; i < m; i++) {
                mm[i] = scan.nextInt();
                sum2 += mm[i];
            }
            Arrays.sort(mm, Collections.reverseOrder());

            int size, count = 0, check = 0;
            if (m > n) {
                size = n;
            } else {
                size = m;
            }
            if (sum1 > sum2) {
                System.out.println("0");
                break;
            } else {
                for (int i = 0; i < size; i++) {
                    int swap = 0;
                    sum1 = 0;
                    sum2 = 0;
                    swap = nn[i];
                    nn[i] = mm[i];
                    mm[i] = swap;
                    System.err.println(Arrays.toString(nn));
                    System.err.println(Arrays.toString(mm));
                    for (int j = 0; j < n; j++) {
                        sum1 += nn[j];
                    }
                    for (int j = 0; j < m; j++) {
                        sum2 += mm[j];
                    }
                    count++;
                    if (sum1 > sum2) {
                        System.out.println(count);
                        check++;
                        break;
                    }
                }
            }
            if (check == 0) {
                System.out.println("-1");
            }
        }
    }

}
