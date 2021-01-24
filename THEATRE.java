package theatre;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author ashish
 */
public class THEATRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t!=0) {            
            int n = scan.nextInt();
            char[] inputc = new char[n];
            int[] inputi = new int[n];
            for (int i = 0; i < n; i++) {
                        inputc[i] = scan.next().charAt(0);
                        inputi[i] = scan.nextInt();
            }
            int[][] slots = new int[4][4];
            for (int i = 0; i < n; i++) {
                if ('A'==inputc[i]) {
                    switch (inputi[i]) {
                        case 12:
                            slots[0][0] += 1;
                            break;
                        case 3:
                            slots[0][1] += 1;
                            break;
                        case 6:
                            slots[0][2] += 1;
                            break;
                        case 9:
                            slots[0][3] += 1;
                            break;
                        default:
                            break;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if ('B'==inputc[i]) {
                    switch (inputi[i]) {
                        case 12:
                            slots[1][0] += 1;
                            break;
                        case 3:
                            slots[1][1] += 1;
                            break;
                        case 6:
                            slots[1][2] += 1;
                            break;
                        case 9:
                            slots[1][3] += 1;
                            break;
                        default:
                            break;
                    }
                }
            }            for (int i = 0; i < n; i++) {
                if ('C'==inputc[i]) {
                    switch (inputi[i]) {
                        case 12:
                            slots[2][0] += 1;
                            break;
                        case 3:
                            slots[2][1] += 1;
                            break;
                        case 6:
                            slots[2][2] += 1;
                            break;
                        case 9:
                            slots[2][3] += 1;
                            break;
                        default:
                            break;
                    }
                }
            }            for (int i = 0; i < n; i++) {
                if ('D'==inputc[i]) {
                    switch (inputi[i]) {
                        case 12:
                            slots[3][0] += 1;
                            break;
                        case 3:
                            slots[3][1] += 1;
                            break;
                        case 6:
                            slots[3][2] += 1;
                            break;
                        case 9:
                            slots[3][3] += 1;
                            break;
                        default:
                            break;
                    }
                }
            }
            int max = slots[0][0];
            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    //System.out.println(i+"k"+j);
                    if(slots[i][j]>max){

                        max = slots[i][j];
                        //System.out.println(i+" "+j);
                        //System.out.println(max);
                    }
                }
            }
            int secondLargest = slots[0][0];
            int largest = slots[0][0];
		for (int i = 0; i < slots.length; i++) {
                    for (int j = 0; j < slots.length; j++) {
                        
 
			if (slots[i][j] > largest) {
				secondLargest = largest;
				largest = slots[i][j];
 
			} else if (slots[i][j] > secondLargest) {
				secondLargest = slots[i][j];
 
			}
		}
                }
            int min = slots[0][0];
            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    //System.out.println(i+"k"+j);
                    if(slots[i][j]<min){

                        min = slots[i][j];
                        //System.out.println(i+" "+j);
                        //System.out.println(max);
                    }
                }
            }
            System.out.println(max);
            System.out.println(secondLargest);
            System.out.println(min);
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(slots[i][j]+ " ");
                }
                System.out.println();
            }
            t--;
    }
    
    }
}
