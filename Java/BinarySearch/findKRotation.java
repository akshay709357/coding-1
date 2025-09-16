class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int n = nums.size();
        int low = 0, high = n - 1;
        int index = 0;
        int res = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums.get(low) <= nums.get(mid)) {
                if (nums.get(low) < res) {
                    res = nums.get(low);
                    index = low;
                }
                low = mid + 1;
            } 
            else {
                if (nums.get(mid) < res) {
                    res = nums.get(mid);
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index; 
    }
}
