/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat.pkgfor.crypto.assignment.pkg4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class LATForCryptoAssignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int[] sbox = {9, 5, 13, 7, 14, 11, 12, 8, 7, 10, 6, 9, 9, 15, 3, 1}; //sbox used in hw3
        int[][] lat = new int[16][5]; 
        int a = 0;
        //filling array with the binary form of the elements from sbox
        for (int i = 0; i < 16; i++) {
            lat[a][0] = sbox[i];
            a++;
            for (int j = 1; j <= 4; j++) {
                while (sbox[i] > 0) {
                    lat[i][j++] = sbox[i] % 2;
                    sbox[i] = sbox[i] / 2;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.print(lat[j][i]+" ");
            }
            System.out.println();
        }
    }

}
