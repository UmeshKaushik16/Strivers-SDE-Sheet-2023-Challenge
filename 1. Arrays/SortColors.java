public class SortColors {
    public void sortColors(int[] nums) {

        int l = 0;
        int mid = 0;
        int h = nums.length-1;

        while(mid<=h)
        {
            if(nums[mid]==0)
            {
                swap(l,mid,nums);
                l++;
                mid++;
            }
            else if(nums[mid]==2)
            {
                swap(mid,h,nums);
                h--;
            }
            else 
            {
                mid++;
            }
        }
    }

    public void swap(int i, int j, int nums[])
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}