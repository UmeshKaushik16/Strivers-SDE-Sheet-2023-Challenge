import java.util.*;;
public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target - nums[i])) // target=9 nums[i]=2 diff = 7
            {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }

            map.put(nums[i],i);
        }

        return ans;
    }
}
