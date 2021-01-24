/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icm2008;
import java.util.Scanner;
/**
 *
 * @author ashish
 */
public class ICM2008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0) {            
            int[] a = new int[4];
            for (int i = 0; i < 4; i++) {
                a[i] = scan.nextInt();
            }
            if (a[0]==a[1]) {
                System.out.println("YES");
            }
            else if(a[2]==a[3]){
                System.out.println("NO");
            }
            else if ((a[0]-a[1])%(a[2]-a[3])==0) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
        
    }
    
}
