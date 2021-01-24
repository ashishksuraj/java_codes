/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liftme;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class LIFTME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            long sum = 0;
            int n = scan.nextInt();
            int q = scan.nextInt();
            int[] nq = new int[2 * q];
            for (int i = 0; i < 2 * q; i++) {
                nq[i] = scan.nextInt();
            }
            try {
                for (int i = 1; i < 2 * q; i++) {
                    if (nq[i] != nq[i - 1]) {
                        sum += Math.abs(nq[i] - nq[i - 1]);
                    }
                }
                sum = sum + nq[0];
                //System.out.println(Arrays.toString(nq)+" "+sum);
                System.out.println(sum);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("e is " + e);
            }

        }
    }

}
