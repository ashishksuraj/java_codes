/* package codechef; // don't place package name! */

package codechef;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        while (T!=0) {  
            long sum1=0, sum2=0;
            int N = scan.nextInt();
            long[] A = new long[N];
            long[] B = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = scan.nextLong();
            }
            for (int i = 0; i < N; i++) {
                B[i] = scan.nextLong();
            }
            Arrays.sort(A);
            Arrays.sort(B);
            for (int i = 0; i < N; i++) {
                if (A[i]<B[i]) {
                    sum1 += A[i];
                }
                else 
                    sum2 +=  B[i];
            }
            long sum = sum1+sum2;
            System.out.println(sum);
            T--;
        }

    } 
}
