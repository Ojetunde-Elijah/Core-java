public class ArrayUtil{

    public void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int arr[] = new int[5];
        printArray(arr);
    }

    public static void main(String args[]){
        ArrayUtil au = new ArrayUtil();
        au.arrayDemo();
    }
}