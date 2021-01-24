/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skmpnew;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class SKMPnew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            String p = scan.next();
            char[] sa = s.toCharArray();
            char[] pa = p.toCharArray();
            int k = 0;
            Arrays.sort(sa);
            Arrays.sort(pa);
            for (int i = 0; i < sa.length; i++) {
                if (k < pa.length) {
                    if (sa[i] == pa[k]) {
                        sa[i] = 0;
                        k++;
                    }
                }
            }
            //System.out.println(sa.length);

            StringBuilder st = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (p.charAt(0) < sa[i]) {
                    for (int j = 0; j < p.length(); j++) {
                        st.append(p.charAt(j));
                    }
                } else {
                    st.append(sa[i]);
                }
            }
            System.out.println(st);
        }
    }

}
