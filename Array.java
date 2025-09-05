public class ArrayOperations{

    public int[] reverseArray(int arr[]){
        int n = arr.length;
        int reversed[] = new int[n];
        for (int i = 0; i < n; i++){
            reversed[i] = arr[n - 1 - i];
        }
        return reversed;
        
    }
    public int[] reverseArray2(int arr[],int start,int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;  
        }
        return arr;
    }

    public int findMinimum(int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public int findSecondMinimum(int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        int secondMinimum = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > min && arr[i] < arr[i-1]){
                secondMinimum = arr[i];
            }
        }
        return secondMinimum;
    }

    public static void main(String args[]){
        int arr[] = {100,13,24,122,44,19};
        
        ArrayOperations ao = new ArrayOperations();
        int result = ao.findSecondMinimum(arr);
        System.out.println(result);
    }
}