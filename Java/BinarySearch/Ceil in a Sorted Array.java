// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int n = arr.length;
        int left =0 , right = n-1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] >= x) {
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}
