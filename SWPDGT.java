/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swpdgt;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class SWPDGT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int[] sap1 = new int[2];
            int[] sap2 = new int[2];
            int number = a, p = 0; // = some int

            while (number > 0) {
                System.out.println(number % 10);
                sap1[p] = number % 10;
                number = number / 10;
                p++;
            }
            p=0;
            number = b;
            while (number > 0) {
                System.out.println(number % 10);
                sap2[p] = number % 10;
                number = number / 10;
                p++;
            }
            System.out.println(Arrays.toString(sap1));
            System.out.println(Arrays.toString(sap2));
        }
    }

}
