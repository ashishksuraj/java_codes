/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifeltd;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class LIFELTD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            char[][] a = new char[3][3];
            for (int i = 0; i < 3; i++) {
                a[i] = scan.next().toCharArray();
            }
            if (a[0][0] == 'l' && a[1][0] == 'l' && a[1][1] == 'l') {
                System.out.println("yes");
                //break;
            } else if (a[0][1] == 'l' && a[1][1] == 'l' && a[1][2] == 'l') {
                System.out.println("yes");
                //break;
            } else if (a[1][0] == 'l' && a[2][0] == 'l' && a[2][1] == 'l') {
                System.out.println("yes");
                //break;
            } else if (a[1][1] == 'l' && a[2][1] == 'l' && a[2][2] == 'l') {
                System.out.println("yes");
                //break;
            } else {
                System.out.println("no");
            }
        }
    }
}
