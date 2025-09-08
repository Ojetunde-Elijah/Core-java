

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

// class Mobile
// {
//     String brand;
//     int price;
//     String network;
//     static String name;

//     static{
//         name = "Phone";
//     }

//     public Mobile(){
//         brand = "";
//         price = 200;
//     }

//     public void show()
//     {
//         System.out.println();
//     }
// }
// class Human
// {
//     private int age;
//     private String name;

//     public Human(){

//     }

//     public int getAge(){
//         return age;
//     }

//     public void setAge(int a){
//         age = a;
//     }

//     public String getName(){
//         return name;
//     }

//     public void setName(String n2){
//         name = n;
//     }
// }


public class Demo
{
    public static void main(String a[])
    {
        B obj = new B(2);
    }
}

class A
{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int");
    }
}

class B extends A
{
    public B(){
        System.out.println("in B");
    }
    public B(int n){
        super(2);
        System.out.println("in B int");
    }
}