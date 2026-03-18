public class ArrayPractice {
    public static int sum(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            count = count + arr[i];
        }
        return count;
    }

    public static int findMax(int arr[]){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void reverse(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args){
        int[] numbers = {4, 12, 7, 1, 25, 3, 9};
        System.out.println(sum(numbers));
        System.out.println(findMax(numbers));
        reverse(numbers);
    }
}