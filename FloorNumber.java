/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floor.number;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class FloorNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int h = 0;
            if (n == 1 || n == 2) {
                System.out.println("1");
                
                
            } else {
                int a = 2;
                while (a < n) {
                    a = a + x;
                    h++;
                    //System.out.println(a+" "+h);
                }
            }
            if (h != 0) {
                System.out.println(h + 1);
            }
        }
    }
}
