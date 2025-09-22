
public class Multadd
{
    public static void main(String[] args) {
        double a = 1.0, b = 2.0, c = 3.0;
        multadd(a, b, c);
        
        System.out.println(multadd(0.5, Math.cos(Math.PI/4.0), Math.sin(Math.PI/4.0)));
        System.out.println(multadd(2.0, 1.0, (Math.log(2)/Math.log(10))));
        System.out.println(expSum(2)); // testing expSum();
    }
    
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }
    
    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), Math.sqrt(1-(Math.exp(-x))));
    }
}