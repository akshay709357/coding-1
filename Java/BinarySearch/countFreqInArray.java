class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int low = 0, high  = arr.length -1 ;
        int first = lowerBound(arr,target,low,high,-1);
        int second = higherBound(arr,target,low,high,-1); 
        if(first == -1) return 0;
        return second - first + 1 ; 
    }

    public int lowerBound(int [] arr,int target,int low,int high,int res) {
               while(low <= high){
                int mid = low + (high -low)/2;
                if(arr[mid] == target) {
                        res = mid;
                        high = mid - 1;
                }else if(arr[mid] < target){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
               }
               return res;
    }

    public int higherBound(int [] arr,int target,int low,int high,int res) {
         while(low <= high){
                int mid = low + (high -low)/2;
                if(arr[mid] == target) {
                        res = mid;
                        low = mid + 1;;
                }else if(arr[mid] > target){
                    high = mid - 1;
                }else{
                    low = mid + 1;;
                }
               }
               return res;
    }
}
