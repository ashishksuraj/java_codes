/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chealg;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class CHEALG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String actual = scan.next();
            int b = 0;
            String done = "";
            char a = actual.charAt(0);
            for (int i = 0; i < actual.length(); i++) {
                if (actual.charAt(i) == a) {
                    b++;
                } else {
                    done = done + a + b;
                    a = actual.charAt(i);
                    b = 1;
                }
            }
            done = done + a + b;
            //System.out.println(actual + " " + done);
            if (done.length() < actual.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
