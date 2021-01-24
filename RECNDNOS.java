/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recndnos;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class RECNDNOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0) {            
            int n = scan.nextInt();
            int[] inp = new int[n];
            int b=0,c=0;
            for (int i = 0; i < n; i++) {
                int a = inp[i];
                for (int j = 0; j < n; j++) {
                    if (inp[j]==a) {
                        b++;
                    }
                    if (inp[j]==a) {
                        if (inp[j]==inp[j-1]) {
                            c++;
                        }
                    }
                }
            }
            
        }
    }
    
}
