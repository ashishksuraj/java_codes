/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class CV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int j = 0, count = 0;
            String str = scan.next();
            //System.out.println(m);
            for (int i = 98; i < 123; i++) {
                System.out.println(i);
                if (i != 97 || i != 101 || i != 105 || i != 111 || i != 117) {
                    if (i == (int) str.charAt(j)) {
                        System.out.println("j is " + j);
                        if (((int) str.charAt(j + 1) == 97 || (int) str.charAt(j + 1) == 101 || (int) str.charAt(j + 1) == 105 || (int) str.charAt(j + 1) == 111 || (int) str.charAt(j + 1) == 117) && j != n - 1) {
                            count++;
                        }
                    }
                    if (j < n) {
                        j++;
                    }
                }

            }
            System.out.println("count is" + count);
        }
    }

}
