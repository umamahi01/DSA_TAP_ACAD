/** given a number find the number of trailing zeros that occurs in a given number factorial .
 *  number of 5's present in a given number that many trailing zeros available in the factorial of a given number.
*/

import java.util.Scanner;
class Trailing_Zeros {
    public static int trialingZeros(int n){
        
        int powerof5 =5;
        int res =0;
        while(n >= powerof5){
            res  += (n/powerof5);
            powerof5 *= 5;
        }
        return res;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(trialingZeros(n));
        sc.close();
        
    }
}
