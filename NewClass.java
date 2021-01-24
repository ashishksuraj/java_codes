/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffl;

/**
 *
 * @author ashish
 */
public class NewClass {
    
                    System.out.println("a is " + a + " n-a is " + (n - a));
                int[] one = new int[n - a];
                int[] zero = new int[a];
                for (int i = 0; i < n; i++) {
                    if (df[i] == 0 && min1 < a) {
                        zero[min1] = p[i];
                        min1++;
                    }
                    if (df[i] == 1 && min2 < (n - a)) {
                        one[min2] = p[i];
                        min2++;
                    }
                }
                System.out.println(min2 + " " + min1);
                System.out.println(Arrays.toString(zero));
                System.out.println(Arrays.toString(one));
                min1 = zero[0];
                min2 = one[0];
                for (int i = 0; i < n - a; i++) {
                    if (min2 > one[i]) {
                        min2 = one[i];
                    }
                }
                for (int i = 0; i < a; i++) {
                    if (min1 > zero[i]) {
                        min1 = zero[i];
                    }
                }
                System.out.println(min2 + " " + min1);
                if ((s + min2 + min1) > 100) {
                    System.out.println("no");
                } else {
                    System.out.println("yes");
                }
    
    
}
