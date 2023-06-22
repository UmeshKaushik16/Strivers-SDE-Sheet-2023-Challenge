import java.util.*;
public class FractionalKnapsack {
    
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here

//created the 2d array for sorting all given values
        double a[][]=new double[n][3];


        for(int i=0;i<n;i++){
            a[i][0]=arr[i].weight;
            a[i][1]=arr[i].value;
            a[i][2]=a[i][1]/(double)a[i][0]; //value by weight
            
        }
        
        //sorting array according to the ratio
        Arrays.sort(a,Comparator.comparingDouble(o->o[2]));
        
        double output=0;
        for(int i=a.length-1;i>=0;i--){
            
            //include whole item
            if(a[i][0]<=W){
                output+=a[i][1];
                W-=a[i][0];
            }
            
            else{
                //include fractional item if capacity is less than the whole item
                output+=a[i][2]*W;
                W=0;
                break;
            }
        }
        return output;
    }
}

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

