package Excercise1;

import java.util.Scanner;

public class SumofODD {
    public static int oddsum(int n){
        int Sum=0;
        for(int i=1; i<=n;i++){
            if(i%2!=0){
                Sum=Sum+i;
            }
            
        }
        return Sum;
         
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum of odd number is" + oddsum(n));
    }
    
}
