/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playpian;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class PLAYPIAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String str = scan.next();
            int a = 0;
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    if (str.charAt(i) == 'A') {
                        if (str.charAt(i + 1) == 'B') {
                            a++;
                        }
                    }
                    if (str.charAt(i) == 'B') {
                        if (str.charAt(i+1) == 'A') {
                            a++;
                        }
                    }
                }
            }
            if (a == str.length() / 2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

}
