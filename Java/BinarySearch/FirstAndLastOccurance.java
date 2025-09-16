class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0, high  = nums.length -1 ;
        int first = lowerBound(nums,target,low,high,-1);
        int second = higherBound(nums,target,low,high,-1); 
        int[] finalArray = new int[2];
        finalArray[0] = first;
        finalArray[1] = second ;
        return finalArray; 
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
