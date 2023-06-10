import java.util.*;
public class SubarrayWithGivenXOR {
    
    public int solve(int[] A, int B) {

        int xor=0;

        int count=0;

        Map<Integer ,Integer> mp= new HashMap<>();

        for(int i=0;i<A.length;i++)

        {

            xor=xor^A[i];

            if(mp.get(xor^B)!=null)

            {

                count+=mp.get(xor^B);

            }

            if(xor==B) count++;

            if(mp.get(xor)!=null)

            {

                mp.put(xor,mp.get(xor)+1);

            }

            else mp.put(xor,1);

        }

        return count;

    }

}