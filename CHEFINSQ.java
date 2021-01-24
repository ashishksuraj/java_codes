package chefinsq;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class CHEFINSQ {
    //Stack<String> str = new Stack<String>();

    /* static int hello(int[] f, int n) {
            //int k=n;
            if (f[n] == 0) {
                System.out.println("hello");
                return n;
            }
            else 
                return (hello(f, n+1));

    }*/
    static void combinationUtil(int arr[], int n, int r, int index, int data[], int i, int nc) {
        int[] f = new int[nc];
        Stack<Integer> stack = new Stack<>();
        //System.out.println(Arrays.toString(f));
        if (index == r) {
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + "ho ");
                stack.push(data[j]);
                // int s = hello(f, 0);
                //System.out.println(s);
                //System.out.println(Arrays.toString(data));
                System.out.println("size is " + stack.size());
                /*for (int k = 0; k < stack.size(); k++) {
                    System.out.println(stack.elementAt(i));
                }*/
                System.out.println(stack.elementAt(j));
            }
            System.out.println("oh");
            return;
        }

        if (i >= n) {
            return;
        }

        data[index] = arr[i];
        combinationUtil(arr, n, r, index + 1, data, i + 1, nc);

        combinationUtil(arr, n, r, index, data, i + 1, nc);
    }

    static void printCombination(int arr[], int n, int r, int nc) {

        int data[] = new int[nc];
        System.out.println(Arrays.toString(data));
        combinationUtil(arr, n, r, 0, data, 0, nc);
        //System.out.println("lol");
    }

    public static void main(String[] args) {
        /* int arr[] = {1, 2, 3, 4};
        int r = 2;
        int n = arr.length;
        printCombination(arr, n, r); */

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            int sub = n - k, fact = 1, nc = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            for (int j = 1; j <= n - k; j++) {
                sub = sub * j;
            }
            nc = fact / sub;
            //System.out.println(nc+" "+fact+" "+sub);
            printCombination(array, array.length, k, nc);
            System.out.println(nc);
        }
    }
}

