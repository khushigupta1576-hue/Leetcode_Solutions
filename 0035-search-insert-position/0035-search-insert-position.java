class Solution {
    public int searchInsert(int[] nums, int target) {
        int count=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==target)
            {
                System.out.println(i);
                
            }
            else if(target>nums[i])
            {
                count=i+1;
            }
        }
        return count;
    }
}