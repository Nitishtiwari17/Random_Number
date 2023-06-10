package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int myNumber=(int)(Math.random()*100);
     int usernumber=0;
     do{
         System.out.println("enter the number b/w (0 to 100):");
         usernumber=sc.nextInt();
         if(usernumber==myNumber){
             System.out.println("WOHOO...CORRECT NUMBER");
             break;
         }
         else if(usernumber>myNumber){
             System.out.println("Your number is too large");
         }
         else{
             System.out.println("your number is too small");
         }
     }while(usernumber>=0);
      System.out.println("MyNumber was:"+myNumber);
    }
}

