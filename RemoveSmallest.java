/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remove.smallest;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class RemoveSmallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int b=0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            if (a.length == 1) {
                System.out.println("YES");
            } else {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n && i != j; j++) {
                        if (a[i] != 0 && a[j] != 0) {
                            if (Math.abs(a[i] - a[j]) <= 1) {
                                if (a[i] - a[j] == 1) {
                                    a[j] = 0;
                                    System.out.println("this is a" + Arrays.toString(a));
                                }
                                if (a[i] == a[j]) {
                                    a[i] = 0;
                                    System.out.println("this is b" + Arrays.toString(a));
                                }
                            }
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    if (a[i]>0) {
                        b++;
                    }
                }
                if (b>=2) {
                    System.out.println("NO");
                }
                else System.out.println("YES");
            }
            //System.out.println(Arrays.toString(a));
        }
    }
}
