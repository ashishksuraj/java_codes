package giftsrc;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ashish
 */
public class GIFTSRC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] coordinate = {0, 0};
            char[] letter = new char[n];
            for (int i = 0; i < n; i++) {
                letter[i] = scan.next().charAt(0);
            }
            System.out.println(Arrays.toString(letter));
            OUTER:
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    switch (letter[0]) {
                        case 76:
                            coordinate[0] -= 1;
                            
                            break;
                        case 82:
                            coordinate[0] += 1;
                            
                            break;
                        case 85:
                            coordinate[1] += 1;
                            
                            break;
                        case 68:
                            coordinate[1] -= 1;
                            
                            break;
                        default:
                            break;
                    }
                }
                if (i != 0) {
                    if (letter[i] == 76 && letter[i] != letter[i - 1]) {
                        coordinate[0] -= 1;
                        
                    } else if (letter[i] == 82 && letter[i] != letter[i - 1]) {
                        coordinate[0] += 1;
                        
                    } else if (letter[i] == 85 && letter[i] != letter[i - 1]) {
                        coordinate[1] += 1;
                        
                    } else if (letter[i] == 68 && letter[i] != letter[i - 1]) {
                        coordinate[1] -= 1;
                        
                    }
                    else System.out.println(i);                 }
            }
            System.out.println(Arrays.toString(coordinate));
            
        }
        //
    }

}
