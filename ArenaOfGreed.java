/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arena.of.greed;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class ArenaOfGreed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int sum = 0;
            while (n > 0) {
                //System.err.println("loop");
                if (n % 2 == 0) {
                    sum = sum + (n / 2);
                    if ((n / 2) % 2 == 0) {
                        n = n / 2 - n / 4;
                    } else {
                        n = n / 2 - 1;
                    }
                } else {
                    sum = sum + 1;
                    n = (n - 1) / 2;
                }
            }
            System.out.println(sum);
        }
    }

}
