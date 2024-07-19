package ttsttsts;

import java.util.*;
class ListOdd {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the size of list");
       int n= sc.nextInt();
       List<Integer> arr= new ArrayList<>();
       for(int i=0;i<n;i++){
           arr.add(sc.nextInt());
       }

       if(isListOdd(arr)) {
           System.out.println("List contains only odd elements");
       }
       else{
           System.out.println("list doesn't contains only odd elements");
       }
   }
   static boolean isListOdd(List<Integer> arr)
   {
       for(int i:arr){
           if(i%2==0)
               return false;
       }
       return true;
   }
}
