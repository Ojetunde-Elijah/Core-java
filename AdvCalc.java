public class AdvCalc extends Calc
{
    public int multi(int n1, int n2){
        return n1 * n2;
    }

    public int div(int n1, int n2){
        if(n2 == 0){
            return "Error divisor must be a positive integer";
        }
        return n1/n2;
    }
}