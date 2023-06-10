import java.util.*;;
public class LongestConsecutiveSequence {
    
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        int maxStreak = 0;
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }

        for(int i: nums)
        {
            if(!set.contains(i-1))
            {
                int cntNum = i;
                int cnt = 1;

                while(set.contains(cntNum+1))
                {
                    cntNum++;
                    cnt++;
                }
                maxStreak = Math.max(maxStreak,cnt);
            }
        }
        return maxStreak;
    }
}