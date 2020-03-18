package edu.academy.homework2;

public class CalculatorWithOperator {

    public double division(double a, double b) {
        double c = a / b;
        return c;
    }

    public double multiplication (double a, double b){
        double d = a * b;
        return d;
    }

    public double subtraction(double a, double b){
        double e = a - b;
        return e;
    }
    public double addition(double a, double b){
        double f = a + b;
        return f;
    }
    public double power(double a, double b){
        double c = Math.pow(a, b);
        return c;
    }
    public double absolute(double a){
        double c = Math.abs(a);
        return c;
    }
    public double root(double a){
        double c = Math.sqrt(a);
        return c;
    }

}
