class Solution {
    public boolean canJump(int[] nums) {
        int r=0;
        int length=nums.length-1;
        for(int i=0;i<=length && r>=i;i++){
        r=Math.max(r,i+nums[i]);
        if(r>=length)
        return true;
        }return false;
        
    }
}
