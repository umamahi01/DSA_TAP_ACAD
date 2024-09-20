/** factorial of a given number using iteration
 * u can give n below 100 */
import java.util.Scanner;
class Factorial_Of_Number {
    public static double factorial(int n){
        double res =1;
            for(int i=n;i>=1;i--){
                res *= i;
            }
            return res;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.printf("%.0f",factorial(n));//format without scienctific notation
        sc.close();
        
    }
}
