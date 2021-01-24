package march20long;

import java.util.Arrays;
import java.util.Scanner;

public class March20long {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] f = new int[n];
            int[] p = new int[n];
            int[] dub = new int[n];
            for (int i = 0; i < n; i++) {
                f[i] = scan.nextInt();
                dub[i] = f[i];
            }
            for (int i = 0; i < n; i++) {
                p[i] = scan.nextInt();

            }
            Arrays.sort(dub);
            int size = 1;
            for (int i = 0; i < n; i++) {
                if (i != n - 1) {
                    if (dub[i] != dub[i + 1]) {
                        size++;
                        System.out.println("i is " + i);
                    }
                }
            }
            int[] sum = new int[size];
            System.out.println("size is " + size);
            for (int i = 1; i <= size; i++) {
                for (int j = 0; j < n; j++) {
                    if (f[j] == i) {
                        sum[i - 1] = sum[i - 1] + p[j];
                        System.out.println(Arrays.toString(sum));
                    }
                }
            }
            int max = sum[0];
            for (int i = 0; i < size; i++) {
                if (sum[i] < max) {
                    max = sum[i];
                }
            }
            System.out.println(max);
        }
    }
}