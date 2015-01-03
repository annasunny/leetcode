class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid;
        if (nums[start] > target || nums[end] < target){
            return -1;
        }
        while (start + 1 < end) {
            mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid;
            } else if (nums[mid] >= target){
                end = mid;
            }
        } // end while
        
        if (nums[start] == target) {
            return start;
        } else if (nums[end] == target) {
            return end;
        } else {
            return -1;
        }
    }
}
