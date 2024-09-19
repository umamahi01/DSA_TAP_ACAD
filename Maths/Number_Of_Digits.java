/**    how many digits are there in a given number
 *     1. check if digits are  there
 *          n>0;
 *      2. remove last element from the number
 *          n = n/10;
 *      3. increase the count after removing
 *          count++;
 *      4 . repeat the above steps until there are digits present
 */




import java.util.Scanner;


class Number_Of_Digits{
    public static int numberOfDigts(int n){
            int count =0;
        while(n>0){
            n /= 10;
            count++; 
        }
        return count;
    }
    public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();

            System.out.println(numberOfDigts(n));
            sc.close();
    }
}