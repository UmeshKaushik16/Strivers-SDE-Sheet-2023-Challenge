import java.util.*;
public class SubsetsII {
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findSubset(0,nums,ans,new ArrayList<>());
        return ans;
    }

    public void findSubset(int idx,int nums[],List<List<Integer>> ans,ArrayList<Integer> ds)
    {
        ans.add(new ArrayList<>(ds));

        for(int i=idx;i<nums.length;i++)
        {
            if(i!=idx && nums[i]==nums[i-1]) continue;

            ds.add(nums[i]);
            findSubset(i+1,nums,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}