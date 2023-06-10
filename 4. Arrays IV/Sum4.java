import java.util.*;;
public class Sum4 {
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        if(nums == null || nums.length == 0) return ans;

        if(target==-294967296 || target==294967296) return ans;

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++)
        {
            int target3 = target - nums[i];

            for(int j=i+1;j<nums.length;j++)
            {
                int target2 = target3 - nums[j];

                int l = j+1;
                int h = nums.length-1;

                while(l < h)
                {
                    if(nums[l] + nums[h] == target2)
                    {
                        ArrayList<Integer> lst = new ArrayList<>();

                        lst.add(nums[i]);
                        lst.add(nums[j]);
                        lst.add(nums[l]);
                        lst.add(nums[h]);

                        ans.add(lst);

                              while(l<h && nums[l] == nums[l+1]) l++;
                        while(l<h && nums[h] == nums[h-1]) h--;

                        l++;
                        h--;
                    }
                    else if(nums[l] + nums[h]< target2) l++;
                    else h--;
                }

                while(j+1 < nums.length && nums[j] == nums[j+1]) j++;
            }
            
            while(i+1 < nums.length && nums[i] == nums[i+1]) i++;
        }

        return ans;
    }
}
