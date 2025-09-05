public class ArrayOperations{

    public int[] reverseArray(int arr[]){
        int n = arr.length;
        int reversed[] = new int[n];
        for (int i = 0; i < n; i++){
            reversed[i] = arr[n - 1 - i];
        }
        return reversed;
        
    }
    public int[] reverseArray2(int arr[], start, end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;  
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        
        ArrayOperations ao = new ArrayOperations();
        int result[] = ao.reverseArray(arr);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}