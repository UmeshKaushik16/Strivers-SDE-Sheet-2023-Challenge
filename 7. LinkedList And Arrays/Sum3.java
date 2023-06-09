import java.util.*;
public class Sum3 {
    
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans= new ArrayList<>();
        int n = nums.length;

        for(int i=0;i<n-2;i++)
        {
            if(i == 0 || (i>0 && nums[i] != nums[i-1]))
            {
                int j = i+1;
                int k = n-1;

                while(j < k)
                {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0)
                    {
                        ArrayList<Integer> tmp = new ArrayList<>();

                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);

                        ans.add(tmp);
                        j++;
                        k--;
                        while(j < k && nums[j] == nums[j-1])
                        {
                            j++;
                        }

                        while(j < k && nums[k] == nums[k+1])
                        {
                            k--;
                        }
                    }
                    else if(sum > 0)
                    {
                        k--;
                    }
                    else
                    {
                        j++;
                    }
                }
            }
        }
        return ans;
    }
}
