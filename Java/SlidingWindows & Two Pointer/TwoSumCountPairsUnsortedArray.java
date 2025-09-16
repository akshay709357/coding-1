// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1}; 
        int target = 2; 
        int count = countPairs(arr,target);
        System.out.println(count);
    }
    
    public static int countPairs(int [] arr , int target){
       HashMap<Integer,Integer> freq = new HashMap<>();
       int count = 0;
       for(int i =0 ;i <arr.length;i++){
           if(freq.containsKey(target-arr[i])){
               count += freq.get(target-arr[i]);
               //count = 1
               //count = 3
               //count = 6
           }
           freq.put(arr[i],freq.getOrDefault(arr[i],0) + 1 );
           //freq = 1
           // freq = 2
           //freq = 3
       }
       return count;
    } 
    
    
}
