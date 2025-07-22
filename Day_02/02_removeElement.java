package Day_02;

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; // write pointer

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j]; // write valid element at position i
                i++; // move write pointer
            }
        }

        return i; // k = count of elements not equal to val
    }
}

