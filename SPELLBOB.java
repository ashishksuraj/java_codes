/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spellbob;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class SPELLBOB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = 0, b = 0, c = 0;
            String top = scan.next();
            String bot = scan.next();
                if (top.charAt(0) == 98 || bot.charAt(0) == 98) {
                    a++;
                }
                if (top.charAt(1) == 111 || bot.charAt(1) == 111) {
                    a++;
                }
                if (top.charAt(2) == 98 || bot.charAt(2) == 98) {
                    a++;
                }
                if (top.charAt(0) == 98 || bot.charAt(0) == 98) {
                    b++;
                }
                if (top.charAt(1) == 98 || bot.charAt(1) == 98) {
                    b++;
                }
                if (top.charAt(2) == 111 || bot.charAt(2) == 111) {
                    b++;
                }
                if (top.charAt(0) == 111 || bot.charAt(0) == 111) {
                    c++;
                }
                if (top.charAt(1) == 98 || bot.charAt(1) == 98) {
                    c++;
                }
                if (top.charAt(2) == 98 || bot.charAt(2) == 98) {
                    c++;
                }
            if (a==3 || b==3 || c==3) {
                System.out.println("yes");
            }
            else System.out.println("no");
        }
    }

}
