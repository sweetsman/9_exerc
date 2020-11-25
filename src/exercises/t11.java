package exercises;
import java.util.Scanner;
public class t11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = input.nextDouble();
        System.out.println("Enter b:");
        double b = input.nextDouble();
        System.out.println("Enter c:");
        double c = input.nextDouble();
        System.out.println("Enter d:");
        double d = input.nextDouble();
        System.out.println("Enter e:");
        double e = input.nextDouble();
        System.out.println("Enter f:");
        double f = input.nextDouble();
        input.close();
        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);
        if(linearEquation.isSolveable())
            System.out.println("x is " + linearEquation.getX() + " y is " + linearEquation.getY());
        else
            System.out.println("The equation has no solution.");

    }
}

class LinearEquation {
    final double EPSILON = 1E-14;
    private double a,b,c,d,e,f;
    LinearEquation(double newA, double newB, double newC,
                   double newD, double newE, double newF){
        a = newA;
        b = newB;
        c = newC;
        d = newD;
        e = newE;
        f = newF;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getD(){
        return d;
    }
    public double getE(){
        return e;
    }
    public double getF(){
        return f;
    }
    public boolean isSolveable(){
        return Math.abs((a *d - b * c) - 0) >= EPSILON ? true : false;
    }
    public double getX(){
        return (e * d - b * f) / (a *d - b * c);
    }
    public double getY(){
        return (a * f - e * c) / (a *d - b * c);
    }

}
