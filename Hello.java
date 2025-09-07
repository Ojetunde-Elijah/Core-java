

// class Calculator
// {
//     int num;
//     public int add(int num, int n2){
//         System.out.println(num);
//         return num + n2;
//     }

//     public static int[] loopArray(int row, int column){
//         int Array[] = new int[row];
//         for(int i = 0; i< row; i++){
//             Array[i] = i+ 1; 
//         }
//         return Array;
//     }

    
//     public static void main(String a[]){
//         // int data = 10;

//         // Calculator obj = new Calculator();
//         // int r1 = obj.add(3,4);
//         // System.out.println(r1);

//         // int nums[] = {3,4,5,6};
//         // for(int n: nums){
//         //     System.out.println(n);
//         // }
//         int[] result = Calculator.loopArray(3,4);
//         for(int n: result ){
//             System.out.println(n);
//         }
//     }
// }


// class Student
// {
//     int rollno;
//     String name;
//     int marks;
// }

class Mobile
{
    String brand;
    int price;
    String network;
    static String name;
}

public class Demo
{
    public static void main(String a[])
    {
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1500;
        obj.name = "SmartPhone";

        Mobile obj1 = new Mobile();
        obj.brand = "Samsung";
        obj1.price = 1700;
        obj1.name = "SmartPhone";
        // StringBuffer sb =new StringBuffer("Elijah");
        // sb.append(" Ojetunde");
        // System.out.println(sb.capacity());
        // System.out.println(sb);
        // Student s1 = new Student();
        // s1.rollno = 1;
        // s1.name = "Ojetunde Elijah";
        // s1.marks = 100;

        // Student s2 = new Student();
        // s2.rollno = 2;
        // s2.name = "Ojetunde Esther";
        // s2.marks = 98;

        // Student s3 = new Student();
        // s3.rollno = 3;
        // s3.name = "Ojetunde Miracle";
        // s3.marks = 99;

        // Student students[] = new Student[3];
        // // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for(int i = 0; i< nums.length;i++)
        // {
        //     System.out.println(nums[i]);
        // }
    }
}