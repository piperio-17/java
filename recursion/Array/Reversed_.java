/* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print the elements of array from end to beginning each in a separate line.
4. For the above purpose complete the body of displayArrReverse function. Don't change the signature.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. 
The purpose of the question is to aid learning recursion and not test you.
*/

import java.io.*;
import java.util.*;

public class Reversed_ {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int [] arr =new int [n];
        n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        displayArrReverse(arr,0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        
        if(idx==arr.length)
        
        {
            return;
        }
       
        displayArrReverse(arr,idx+1);
         System.out.println(arr[idx]);
        
         
        
       

    }

}