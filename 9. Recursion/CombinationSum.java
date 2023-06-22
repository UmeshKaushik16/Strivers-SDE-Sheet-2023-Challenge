import java.util.*;;
public class CombinationSum {
    
    public List<List<Integer>> combinationSum(int[] arr, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(0,target,arr,ans,new ArrayList<>());
        
        return ans;
    }

    public void combinationSum(int idx, int target,int arr[],List<List<Integer>> ans, List<Integer> ds)
    {
        if(idx == arr.length)
        {
            if(target == 0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }


        if(arr[idx] <= target)
        {
            ds.add(arr[idx]);
            combinationSum(idx,target-arr[idx],arr,ans,ds);
            ds.remove(ds.size()-1);
        }

        combinationSum(idx+1,target,arr,ans,ds);
    }
}


