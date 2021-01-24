/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lch15jab;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class LCH15JAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int a = 0;
        while (t-- > 0) {
            String str = scan.next();
            int[] check = new int[26];
            if (str.length() % 2 == 0) {
                for (int i = 0; i < str.length(); i++) {
                    check[str.charAt(i) - 97]++;
                }
                int max = check[0];
                for (int i = 1; i < 26; i++) {
                    if (check[i]>max) {
                        max = check[i];
                    }
                }
                if (max==(str.length()/2)) {
                    System.out.println("YES");
                }
                else System.out.println("NO");
            } else {
                System.out.println("NO");
            }
            //System.out.println(Arrays.toString(check));
        }
    }
}
