import java.util.*;
public class LargestSubarrayWith0Sum {
    
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            if(map.containsKey(sum))
            {
                int idx = map.get(sum);
                int len = i - idx;
                
                max = Math.max(max,len);
            }
            else
            {
                map.put(sum,i);
            }
        }
        return max;
    }
}