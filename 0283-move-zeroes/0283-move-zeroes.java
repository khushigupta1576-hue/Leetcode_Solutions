class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
		for(int i=0; i<nums.length; i++)
		{
			for(int j=0; j<nums.length-1-i; j++)
			{
				if(nums[j]==0)
				{
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		for(int s=0; s<nums.length; s++)
		{
			System.out.print(" "+nums[s]);
		}
	}
}
