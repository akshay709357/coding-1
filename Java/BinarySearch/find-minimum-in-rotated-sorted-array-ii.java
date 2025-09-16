class Solution {
    public int findMin(int[] nums) {
       int maxi = Integer.MAX_VALUE ,left = 0 , right = nums.length -1;
       while(left <= right){
        int mid = left + (right-left)/2;
        maxi =Math.min(maxi,nums[mid]);
        if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
            maxi = Math.min(maxi, nums[left]);
            left++;
            right--;
        }
        else if(nums[left] <= nums[mid]){
            maxi =Math.min(maxi,nums[left]);
            left = mid +  1;
        }else{
            maxi =Math.min(maxi,nums[mid]);
            right = mid -  1;
        }
       }
       return maxi; 
    }
}
