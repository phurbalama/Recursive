/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive;

/**
 *
 * @author phurb
 */
public class Recursive {


    public static void main(String[] args) {
        int arr[] = {2,4,6,8,60,80}; //assign array values
        int size = arr.length; //get size of array
        int x = 5;
         //create object of the class
        binaryy ob = new binaryy();  
     //use search func that takes arrray,firstElement index,size -1 and 
        //search value
        int result = ob.binarySearch(arr,0,size-1,x); 
        System.out.println(result);
}
}
    class binaryy{
       
        public int binarySearch(int[] arr,int firstElement,int size,int value){
            
            if(size>=1){
                int mid = firstElement + (size-1)/2;
                
                if(arr[mid]==value)
                    return mid;
                else if(arr[mid]>value)
                     return binarySearch(arr,firstElement,mid-1,value);
                else if(arr[mid]<value)
                    return binarySearch(arr,mid+1,size,value);
               
                
               
                
            }
            else 
                  return -1;       
        }
            
    }
    class multiply{
        public int mult(int x,int n){
            if(n==0)
                return 0;
    //using recursive program to multiply two num using addition
            else
                return x + mult(x,n-1); 
    }
    }
//find Max Class
 class findMax{
     public int findMax(int[] arr,int size){
         if(size==1)
             return arr[0];
         //recursion being used in return.. using Math.max 
                //to find the maximum of two array element
         else  
            return Math.max(arr[size-1], findMax(arr,size-1));              
     }
 }
//Power class
 class power{
     //power function that takes in value x and power on n
    public int pow(int x, int n)       
    {
        if(n==0) 
            return 1;
        else
            return x * pow(x,n-1); //recursive function
    }
}
