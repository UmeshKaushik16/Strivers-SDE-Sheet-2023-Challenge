import java.util.*;
public class MajorityElementII {
    
    public List<Integer> majorityElement(int[] nums) {

        int n1 = -1;
        int n2 = -1;
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;

        for(int i=0;i<n;i++)
        {
            if(n1 == nums[i])
            {
                count1++;
            }
            else if(n2 == nums[i])
            {
                count2++;
            }
            else if(count1 == 0)
            {
                n1 = nums[i];
                count1++;
            }
            else if(count2 == 0)
            {
                n2 = nums[i];
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<n;i++)
        {
            if(n1 == nums[i])
            {
                count1++;
            }
            else if(nums[i] == n2)
            {
                count2++;
            }
        }

        
        if(count1 > n/3)
        {
            ans.add(n1);
        }

        if(count2 > n/3)
        {
            ans.add(n2);
        }

        return ans;
    }
}
