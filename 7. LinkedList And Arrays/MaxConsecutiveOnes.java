public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int n = nums.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 1) cnt++;
            if(nums[i] != 1 ) cnt=0;

            max = Math.max(max,cnt);
        }
        return max;
    }
}
