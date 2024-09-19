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