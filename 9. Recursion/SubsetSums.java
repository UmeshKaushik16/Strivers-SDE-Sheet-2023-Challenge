import java.util.*;
public class SubsetSums {
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        
        ArrayList<Integer> ans = new ArrayList<>();
        findSubsetSum(0,arr,ans,0);
        return ans;
    }
    
    public void findSubsetSum(int idx,ArrayList<Integer> arr,ArrayList<Integer> ans, int sum)
    {
        if(idx==arr.size())
        {
            ans.add(sum);
            return;
        }
        sum+=arr.get(idx);
        findSubsetSum(idx+1,arr,ans,sum);
        
        sum-=arr.get(idx);
        findSubsetSum(idx+1,arr,ans,sum);
    }
}
