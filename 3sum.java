class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length < 3) {
            return lists;
         }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                break;
            if(i>0 && nums[i] == nums[i-1])
                continue;
            int left=i+1,right=nums.length-1;
            while(left<right)
            {
                if(nums[i]+nums[left]+nums[right] == 0)
                {
                    lists.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left < right && nums[left] == nums[left+1])
                    {
                        left++;
                    
                    }
                    while(left < right && nums[right] == nums[right-1])
                    {
                        right--;
                    
                    }
                    left++;
                    right--;
                }
                else if(nums[i]+nums[left]+nums[right] > 0)
                    right--;
                else
                    left++;
                
                
            }
                
        }
        return lists;
        
        
    }
}
