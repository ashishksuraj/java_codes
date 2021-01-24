/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class COVID19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] x = new int[n];
            int[] spa = new int[n - 1];
            for (int i = 0; i < n; i++) {
                x[i] = scan.nextInt();
            }
            if (n == 2) {
                if (x[1] - x[0] <= 2) {
                    System.out.println("2 2");
                } else {
                    System.out.println("1 1");
                }
            } else {
                int a = 0;
                int[] spe = new int[n - 1];
                for (int i = 1; i < n; i++) {
                    spa[i - 1] = x[i] - x[i - 1];
                    if (spa[i - 1] <= 2) {
                        spe[a]++;
                    } else {
                        a++;
                    }
                }
                if (spe[0] == 0) {
                    System.out.println("1 1");
                } else {
                    int max = 1, min = 100;
                    for (int i = 0; i < n - 1; i++) {
                        if (spe[i] != 0) {
                            if (spe[i] > max) {
                                max = spe[i];
                            }
                            if (spe[i] < min) {
                                min = spe[i];
                            }
                        }
                    }
                    System.out.println((min+1) + " " + (max+1));
                }
            }
        }
    }

}
