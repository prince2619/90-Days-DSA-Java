package Day_02;

class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array has only 0 or 1 element, return its length
        if (nums.length == 0) return 0;
        
        // Pointer for the last unique element's index
        int i = 0;
        
        // Start iterating from the second element
        for (int j = 1; j < nums.length; j++) {
            // If we find a new unique element
            if (nums[j] != nums[i]) {
                i++; // Move the unique pointer
                nums[i] = nums[j]; // Place the unique element at the next position
            }
        }
        
        // Return the count of unique elements
        return i + 1;
    }
}

