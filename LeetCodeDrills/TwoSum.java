// Problem: Given an array of integers and a target, 
// return true if any two numbers add up to the target, 
// false if not. Don't return indices — just true or false.

public static boolean twosum (int[] arr, int target){
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
        for (int j = i + 1; j < arr.length; j++){
            sum = arr[i] + arr[j];
            if (sum == target){
                return true;
            }
        }
    }
    return false;
}