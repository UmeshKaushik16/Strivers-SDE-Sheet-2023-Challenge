public class ReversePairs {
    
    int ans=0;
    public int reversePairs(int[] arr) {
        
        int n=arr.length;
        mergeSort(arr,0,n-1);
        return ans;
    }
    
    
    public void mergeSort(int arr[], int l, int r)
    {
        if(l<r)
        {
            int mid = l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
            
    }
    
    public void merge(int arr[], int l, int m, int r)
    {
        
        
        int n1=(m-l+1);
        int n2=(r-m);
        
        int a[] = new int[n1];
        int b[] = new int[n2];
        
        for(int i=0;i<n1;i++)
        {
            a[i]=arr[l+i];
        }
        
        for(int j=0;j<n2;j++)
        {
            b[j]=arr[m+1+j];
        }
        
        int i=0;
        int j=0;
        int cnt=0;
        
        for(i=0;i<n1;i++)
        {
            while(j<n2 && a[i]>(long)2*b[j])
            {
                j++;
            }
            cnt+=j;
        }
        ans+=cnt;
        
        i=0;
        j=0;
        int k=l;
        
        while(i<n1 && j<n2)
        {
            if(a[i]<=b[j])
            {
                arr[k]=a[i];
                i++;
            }
            else
            {
                arr[k]=b[j];
                j++;
            }
            k++;
        }
        
        while(i<n1)
        {
            arr[k++]=a[i++];
        }
        
        while(j<n2)
        {
            arr[k++]=b[j++];
        }
        
        // return ans;
    }
    
}