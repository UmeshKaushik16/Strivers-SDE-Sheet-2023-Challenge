public class MajorityElement {
    
    public int majorityElement(int[] nums) {

        int n = nums.length;
        int ans = nums[0];
        int count =0;
        for(int i=0;i<n;i++)
        {
            if(ans == nums[i])
            {
                count++;
            }
            else if(count == 0)
            {
                ans = nums[i];
                count = 1;
            }
            else
            {
                count--;
            }
        }

        count =0;

        for(int i=0;i<n;i++)
        {
            if(ans == nums[i])
            {
                count++;
            }
        }
        
        if(count > n/2)
        {
            return ans;
        }

        return -1;
    }
}