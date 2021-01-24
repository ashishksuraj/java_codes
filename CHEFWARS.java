/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chefwars;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class CHEFWARS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int h = scan.nextInt();
            int p = scan.nextInt();
            int a=0;
            //p = (int) Math.floor(p/2);
            //System.err.println("pop " + h + " " + p);
            while (p != 0 && p > 0 && h > 0) {
                if (p>h || p==h) {
                    a++;
                    //System.err.println("pol " + h + " " + p);
                    break;
                }
                h = h - p;
                p = (int) Math.floor(p / 2);
                //System.err.println("pop " + h + " " + p);
            }
            if (a>0) {
                System.out.println("1");
            }
            else System.out.println("0");
            //System.out.println(h + " " + p);
        }
    }

}
