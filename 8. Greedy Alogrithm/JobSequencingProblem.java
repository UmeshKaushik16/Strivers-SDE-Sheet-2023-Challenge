import java.util.*;
public class JobSequencingProblem {
    
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (a,b) -> b.profit - a.profit);
        
        int maxiDeadLine = 0;
        
        for(int i=0;i<n;i++)
        {
            maxiDeadLine = Math.max(maxiDeadLine, arr[i].deadline);
        }
      
        int result[] = new int[maxiDeadLine + 1];
        
        for(int i =1;i<=maxiDeadLine;i++)
        {
            result[i] = -1;
        }
        
        int countJobs = 0, maxProfit = 0;
        
        for(int i=0;i<n;i++)
        {
            int curId = arr[i].id;
            int curProfit = arr[i].profit;
            int curDeadline = arr[i].deadline;
            
            for(int k =curDeadline; k>0;k--)
            {
                if(result[k] == -1)
                {
                    countJobs++;
                    result[k] = curId;
                    maxProfit += curProfit;
                    break;
                }
            }
        }
        
        int ans[] = new int[2];
        ans[0] = countJobs;
        ans[1] = maxProfit;
        
        return ans;
    }
}


class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

