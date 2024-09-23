package grp.art.Test;

import java.util.Scanner;

class FindoutPrime
{
         FindoutPrime (int n)
         
         {
        	 for(int num=2;num<=100;num++) {
         int count=0,i=1;
         while(i<=num)
         {
            if(num%i==0)
            {

            		count++;      
            }
            i++;
         }
         if(count==2)
             System.out.println(num+" is a prime number ");
         else
         System.out.println(num+" is not a prime number ");    
         }
         }
}
class Prime
{
         public static void main(String arg[])  
         {
               System.out.println("Enter a number ");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         new FindoutPrime (n);
         }
}