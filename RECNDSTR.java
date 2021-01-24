/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recndstr;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class RECNDSTR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String str = scan.next();
            int[] str1 = new int[str.length()];
            int[] str2 = new int[str.length()];
            for (int i = 0; i < str.length() - 2; i++) {
                str1[i] = str.charAt(i + 1);
            }
            str1[str.length()-1] = str.charAt(0);
            for (int i = 1; i < str.length() - 1; i++) {
                str2[i] = str.charAt(i - 1);
            }
            str2[0] = str.charAt(str.length()-1);
            System.out.println(Arrays.toString(str2));
            System.out.println(Arrays.toString(str1));
        }
    }

}
