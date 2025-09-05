public class ArrayOperations{

    public int[] findEven(int arr[]){
        int n = arr.length;
        int oddCount = 0;
        for(int i = 0 ; i< n; i++){
            if(arr[i] % 2 != 0){
                oddCount++;    
            }
            
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 != 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        ArrayOperations ao = new ArrayOperations();
        int evenArr[] = ao.findEven(arr);
        for(int i = 0; i < evenArr.length; i++){
            System.out.println(evenArr[i]);
        }
    }
}