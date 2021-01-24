/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decodeit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class DECODEIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0) {            
            int n = scan.nextInt();
            String s = scan.next();
            int div = n/4;
            int[] dec = new int[div];
            int[] fill = new int[4];
            int count = 0;
            int k = 0;
            int j = 0;
            
            for (int i = 0; i < n; i++) {
                fill[k] = s.charAt(i)-48;
                k++;
                count++;
                if (count == 4) {
                    count = 0;
                    dec[j] = fill[0]*8 + fill[1]*4 + fill[2]*2 + fill[3]*1;
                    j++;
                    k = 0;
                }
            }
            //System.out.println(Arrays.toString(dec));
            for (int i = 0; i < div; i++) {
                char c = (char)(dec[i]+97);
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
}
