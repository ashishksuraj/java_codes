/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manysums;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class MANYSUMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0) {            
            int l = scan.nextInt();
            int r = scan.nextInt();
            int diff = r-l+1;
            System.out.println(diff*2 - 1);
        }
    }
    
}
