import java.util.*;
public class NMeetingsInOneRoom {
    
    public static int maxMeetings(int start[], int end[], int n)
    {
        ArrayList<Pair> arr = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            arr.add(new Pair(start[i],end[i]));
        }
        
        Collections.sort(arr,(a,b) -> a.end - b.end);
        
        int count=1;
        int curEnd = arr.get(0).end;
        
        for(int i=0;i<n;i++)
        {
            if(curEnd < arr.get(i).start)
            {
                count++;
                curEnd = arr.get(i).end;
            }
        }
        
        return count;
    }
}

class Pair
{
    int start;
    int end;
    
    public Pair(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
}