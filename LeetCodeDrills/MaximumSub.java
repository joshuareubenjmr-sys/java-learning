package LeetCodeDrills;

public class MaximumSub {
    public static int MaxSub(int[] arr){
        
        int currentSum = arr[0];
        int leastSum = arr[0]; // so we chose arr[0] simply because 
                                // we need a starting poit and since 
                                // we started at 1 in our loop 
                                // doing arr[0] allows us to also check 
                                // against the initial value



        for(int i = 1; i < arr.length; i++){
            currentSum = Math.min(arr[i], currentSum + arr[i]); // gives choice between restarting at current value or continuing
            leastSum = Math.min(currentSum, leastSum);
    }
    return leastSum;
    }
}
