import java.util.Scanner;

class ClosestToZero{

    public static int  closestToZero(int [] arr){

            if(arr.length == 1){

                return arr[0];
            }
            int pmin =Integer.MAX_VALUE,nmax = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0 && arr[i]<pmin){
                    pmin = arr[i];
                }
                if(arr[i]<0 && arr[i]>nmax){
                    nmax = arr[i];
                }
            }
           
            
            if (pmin != Integer.MAX_VALUE && (nmax == Integer.MIN_VALUE || pmin <= (-nmax))) {
                return pmin;
            }
            return nmax;

            
    }


    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
       int res = closestToZero(arr);
        System.out.println(res);
    }
}