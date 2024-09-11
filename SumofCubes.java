/**
 * Tosia Bednarz
 * 9/9/2024
 * Asks user for a number and and then finds the sum
 */
 import java.util.*;
 public class SumofCubes{
     public static void main(String[]args){
     int num;
     int ans;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter a number: ");
     num = input.nextInt();
     ans = 0;
     while(num > 0 ){
         int dig2;
         dig2 = num%10;
         ans+= (dig2*dig2*dig2);
         num=num/10;
     }
     System.out.print(ans);
     }
 }