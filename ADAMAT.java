/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adamat;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class ADAMAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[][] inp = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    inp[i][j] = scan.nextInt();
                }
            }
            int[][] tr = new int[n][n];
            int count = n, finalcount = 0;
            for (int k = n; k > 0; k--) {
                if (inp[0][k - 1] != count) {
                    for (int i = 0; i < count; i++) {
                        for (int j = 0; j < count; j++) {
                            tr[i][j] = inp[j][i];
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            inp[i][j] = tr[i][j];
                        }
                    }
                    count -= 1;
                    finalcount += 1;
                } else {
                    count -= 1;
                }
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(tr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(finalcount);
        }
    }

}
