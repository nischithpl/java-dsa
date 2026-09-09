package Excercise1;

import java.util.Scanner;

public class Eligibility {
    public static void voters(int n){
        if(n>=18){
            System.out.println("Eligible for voting");
        }
        else if(n<0){
            System.out.println("Invalid age");
        }
        else{
            System.out.println("Not Eligible for voting");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        voters(n);
    }
    
}
