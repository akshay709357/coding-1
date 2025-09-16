class Solution {
    public int findMin(int[] arr) {
        int ans = Integer.MAX_VALUE , left = 0 , right = arr.length -1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[left] <= arr[mid]) {
                 ans = Math.min(ans,arr[left]);
                 left = mid + 1;
            }else{
                ans = Math.min(ans,arr[mid]);
                right = mid - 1;
            }
        }
        return ans;
    }
}
