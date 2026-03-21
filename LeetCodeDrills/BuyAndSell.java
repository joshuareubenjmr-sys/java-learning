package LeetCodeDrills;

public class BuyAndSell {
    public static int stockTing(int[] arr){

        int highest = arr[0];
        int maxDif = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > highest){
                highest = arr[i];
            }
            if(highest - arr[i] > maxDif){
                maxDif = highest - arr[i];
            }
        }
        return maxDif;
    }
}
