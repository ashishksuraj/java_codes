/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skmp;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class SKMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String st1 = scan.next();
            String st2 = scan.next();
            int k = 0, d = 0;
            if (st1.length() == st2.length()) {
                System.out.println(st2);
            } else {
                int[] a = new int[st1.length()];
                int[] b = new int[st2.length()];
                for (int i = 0; i < st1.length(); i++) {
                    a[i] = st1.charAt(i);
                    if (i < st2.length()) {
                        b[i] = st2.charAt(i);
                    }
                }
                Arrays.sort(a);
                Arrays.sort(b);
                for (int i = 0; i < st1.length(); i++) {
                    if (k < st2.length()) {
                        if (a[i] == b[k]) {
                            a[i] = 0;
                            k++;
                        }
                    }
                }
                StringBuilder st = new StringBuilder();
                for (int i = 0; i < a.length; i++) {
                    if (st2.charAt(0) < a[i] && a[i] != 0) {
                        for (int j = 0; j < b.length; j++) {
                            d = i;
                            st.append(st2.charAt(j));
                            if (j == (b.length - 1)) {
                                break;
                            }
                        }
                        break;
                    } else {
                        char c = (char) a[i];
                        if (a[i] != 0) {
                            st.append(c);
                        }
                    }
                }
                //System.err.println(d);
                if (d == 0) {
                    for (int i = 0; i < b.length; i++) {
                        st.append(st2.charAt(i));
                    }
                } else {
                    for (int i = d; i > 0; i++) {
                        if (st.length() == st1.length()) {
                            break;
                        } else {
                            if (a[i] != 0) {
                                char c = (char) a[i];
                                st.append(c);
                            }
                        }
                    }
                }
                System.out.println(st);
            }
        }
    }
}
