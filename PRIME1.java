/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime1;
import java.util.Scanner;
/**
 *
 * @author ashish
 */
public class PRIME1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        while (t-->0) {            
            int m = scan.nextInt();
            int n = scan.nextInt();
            for (int i = m; i <= n; i++) {
                if (i==2) {
                    System.out.println("2");
                }
            }
        }
    }
    
}
