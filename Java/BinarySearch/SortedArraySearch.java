class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            //mid formula is this bcz to avoid overflow cases , assume high and low as INT_MAX.
            int mid = low + (high -low)/2;
            if(arr[mid] == k){
                return true;
            }else if(arr[mid] < k) {
                low =  mid + 1;
            }else{
                high = mid - 1 ;
            }
        }
        return false;
    }
}
