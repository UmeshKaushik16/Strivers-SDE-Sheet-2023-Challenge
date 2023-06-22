import java.util.*;
public class CombinationSumII {
    
    public List<List<Integer>> combinationSum2(int[] arr, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        combinationSum2(0,target,arr,ans,new ArrayList<>());

        return ans;
    }

    public void combinationSum2(int idx, int target,int arr[],List<List<Integer>> ans, List<Integer> ds)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=idx;i<arr.length;i++)
        {
            if(idx!=i && arr[i] == arr[i-1])
            {
                continue;
            }

            if(target < arr[i])
            {
                break;
            }

            ds.add(arr[i]);
            combinationSum2(i+1,target-arr[i],arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}


