/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popgates;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class POPGATES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            char[] chr = new char[n];
            int l=n;
           // inp = scan.next();
            for (int i = 0; i < n; i++) {
                chr[i]= scan.next().charAt(0);
            }
                //System.out.println(chr);
            for (int i = 0; i < k; i++) {
               // char H = 0;
                if (chr[l-1]==72) {
                    for (int j = 0; j < l-1; j++) {
                        if (chr[j]==72) {
                            chr[j]=84;
                        }
                        else{
                            chr[j]=72;
                        }
                    }
                    chr[l-1]=70;
                    l=l-1;
                    System.out.println(chr);
                }
                else{
                    chr[l-1]=70;
                    l=l-1;
                    System.out.println(chr);
                }
            }
            //System.out.println(chr);
            int m=0;
            for (int i = 0; i < l; i++) {
                //int m=0;
                if (chr[i]==72) {
                    m=m+1;
                    //System.out.println(m +"ra");
                }
            }
            System.out.println(m);
        }
    }

}
