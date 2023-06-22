public class MinimumPlatforms {
    
    int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platform = 1;
        int max = 1;
        int i =1;
        int j=0;
        
        while(i < n && j < n)
        {
            if(arr[i] <= dep[j])
            {
                platform++;
                i++;
            }
            else if(arr[i] > dep[j])
            {
                platform--;
                j++;
            }
            
            max = Math.max(max,platform);
        }
        
        return max;
    }
    
}

