

class Calculator
{
    int num;
    public int add(int num, int n2){
        System.out.println(num);
        return num + n2;
    }

    public static int[] loopArray(int row, int column){
        int Array[] = new int[row];
        for(int i = 0; i< row; i++){
            Array[i] = i+ 1; 
        }
        return Array;
    }

    
    public static void main(String a[]){
        // int data = 10;

        // Calculator obj = new Calculator();
        // int r1 = obj.add(3,4);
        // System.out.println(r1);

        // int nums[] = {3,4,5,6};
        // for(int n: nums){
        //     System.out.println(n);
        // }
        int[] result = Calculator.loopArray(3,4);
        for(int n: result ){
            System.out.println(n);
        }
    }
}


