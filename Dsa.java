class Dsa{
    public static void main(String args[]){
        Polynomial p = new Polynomial();
        p.print(3);
    }
}

class Polynomial{
    public void print(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.println("i = " + i + " j = " + j);
            }
            System.out.println("End of Inner Loop");
        }
        System.out.println("End of Outer Loop");
    }
}