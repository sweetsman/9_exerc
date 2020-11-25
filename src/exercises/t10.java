package exercises;
import java.util.Scanner;
public class t10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the equation's a");
        double a = sc.nextDouble();
        System.out.println("Enter the equation's b");
        double b = sc.nextDouble();
        System.out.println("Enter the equation's c");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("root1 is " + quadraticEquation.getRoot1());
            System.out.println("root2 is " + quadraticEquation.getRoot2());
        }else
        if (quadraticEquation.getDiscriminant() == 0) {
            //因为两个值相等引用一个就可以
            System.out.println("root is " + quadraticEquation.getRoot1());
        }else {
            System.out.println("Ths equation has no roots.");
        }

    }

}

class QuadraticEquation {
    private double a,b,c;
    QuadraticEquation(double newA, double newB, double newC){
        a = newA;
        b = newB;
        c = newC;
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
    public double getDiscriminant(){
        return Math.pow(b, 2) - 4 * a * c;
    }
    public double getRoot1(){
        if(this.getDiscriminant() >= 0)
            return (-b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
        else
            return 0;
    }
    public double getRoot2(){
        if(this.getDiscriminant() >= 0)
            return (-b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
        else
            return 0;
    }
}


