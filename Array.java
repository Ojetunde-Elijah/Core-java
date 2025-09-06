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

    public int[] reArrangeArray(int arr[]){
        int n = arr.length;
        int newArr[] = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] > 0){
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }
    public boolean isPalindrome(String str){
        Character arr[] = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            if (arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[] = {0,1,0,4,1,2};
        
        ArrayOperations ao = new ArrayOperations();
        int result[] = ao.reArrangeArray(arr);
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}