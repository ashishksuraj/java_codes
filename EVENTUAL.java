/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventual;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class EVENTUAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int b = 0;
            int[] a = new int[26];
            for (int i = 0; i < s.length(); i++) {
                a[s.charAt(i) - 97]++;
            }
            for (int i = 0; i < 26; i++) {
                if (a[i]!=0) {
                    if (a[i]%2!=0) {
                        b++;
                        break;
                    }
                }
            }
            System.out.println(b);
            if (b>0) {
                System.out.println("NO");
            }
            else System.out.println("YES");
            System.out.println(Arrays.toString(a));
        }
    }

}
