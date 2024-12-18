//This calculator only does sums of whole numbers. To do a sum of fractional numbers, change the 'int' variables to 'double'
public class Calculator{
    //constructor
    public  Calculator(){}
    //public return methods; a is the first number, b is the second number
    public int add(int a, int b){
        return  a +  b;
    }
    public int subtract(int a, int b){
        return a -  b;
    }
    public int multiply(int a, int b){
        return  a *  b;
    }
    public int divide(int a, int b){
        return  a / b;
    }
    public int modulo(int a, int b){
        return  a %  b;
    }
    //main method
    public static void main(String[] args){
        //object creation to enable access to Constructor
        Calculator myCalculator = new Calculator();
        //calling all methods on myCalculator
        int add = myCalculator.add(5,7);
        int subtract = myCalculator.subtract(45,11);
        int divide = myCalculator.divide(25,5);
        int modulo = myCalculator.modulo(23,5);
        //printing out the value of the called methods
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(divide);
        System.out.println(modulo);
    }
}