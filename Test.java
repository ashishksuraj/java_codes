package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {



    // Driver code 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] st = new String[20];
        for (int i = 0; i < 20; i++) {
            st[i] = scan.next();
        }
        System.out.println(Arrays.toString(st));
    }
}
