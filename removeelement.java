class Solution {
    public int removeElement(int[] nums, int val) {
        
        return removeelement(nums, val);
    }
    public int removeelement(int nums[], int val) {
        int count = 0; // count is used to store the elements for output
        for (int i = 0; i < nums.length; i++) { // i is the index of the original array
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 2, 2, 3}; // initialized array correctly
        int val = 3;
        int length = sol.removeElement(nums, val); 
        System.out.println("New length: " + length);
    }
}
