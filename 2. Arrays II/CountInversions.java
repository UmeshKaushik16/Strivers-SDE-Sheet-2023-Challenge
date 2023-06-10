public class CountInversions {

    public static int mergeSort(long arr[], int l, int r)
    {
        int cnt=0;
        if(l<r)
        {
            int mid = l+(r-l)/2;
            cnt += mergeSort(arr, l, mid);
            cnt += mergeSort(arr, mid+1, r);
            
            cnt += merge(arr,l,mid,r);
        }
        return cnt;
    }

    public static int merge(long arr[], int l, int mid, int r)
    {
        
        int i=l;
        int j=mid+1;
        int k=l;

        long ans[] = new long[arr.length];

        int cnt=0;
        while(i<=mid && j<=r )
        {
            if(arr[i] > arr[j])
            {
                ans[k++] = arr[j++];
                cnt += mid - i +1;
            }
            else
            {
                ans[k++] = arr[i++];
            }
        }

        while(i<=mid)
        {
            ans[k++] = arr[i++];
        }

        while(j<=r)
        {
            ans[k++] = arr[j++];
        }

        for (i = l; i <= r; i++) {
            arr[i] = ans[i];
        }
        return cnt;
    }
    public static long getInversions(long arr[], int n) {

        int ans = mergeSort(arr,0,n-1);
        return (long)ans;
    }
}

