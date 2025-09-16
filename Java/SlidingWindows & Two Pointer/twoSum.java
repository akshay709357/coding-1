class Solution {
    boolean twoSum(int arr[], int target) {
    // code here
    
     /*    BRUTE FORCE APPROACH 0(N * N)
            for(int i =0;i<arr.length;i++){
               for(int j = i + 1 ; j<arr.length;j++){
                   if(arr[i] + arr[j] == target){
                       return true;
                   }
               }
            }
            return false;
    */
    
    /*  BRUTE FORCE APPROACH 0(N * N)
          int l = 0, r = 1;
          while (l < arr.length) {
            if (r < arr.length) {
                if (arr[l] + arr[r] == target) {
                        return true;
                }
                r++;
            } else {
                l++;
                r = l + 1; 
                }
            }
            return false;
    */
    
    /* BETTER SOLUTION O (n log n)
        Arrays.sort(arr);
            int l = 0 , r= arr.length-1,sum =0;
            while(l<r){
                sum = arr[l] + arr[r];
                if(sum == target) return true;
                else if(sum < target) l++;
                else r--;
            }
            return false;
   */
   
   HashSet<Integer> seen =new HashSet<>();
   for(int num : arr){
       int sub = target - num ;
       if(seen.contains(sub)){
           return true;
       }
       seen.add(num);
   }
   return false;
}
   
}
