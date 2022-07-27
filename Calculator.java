public class Calculator {
    public Calculator(){

    }

    // Adding two parameterers
    public int add(int a, int b){
        int add = a + b;
        System.out.println("Wynik dodawania to: "+add);
        return add;
    }

    //Substract two parameters
    public int subtract(int a, int b){
        int subtract = a - b;
        System.out.println("Wynik odejmowania to: "+subtract);
        return subtract;
    }

    //Multiply two parameters
    public int multiply(int a, int b){
        int multiply = a * b;
        System.out.println("Wynik mnożenia to: "+multiply);
        return multiply;
    }

    //Divide two parameters
    public int divide(int a, int b){
        int divide = a / b;
        System.out.println("Wynik dzielenia to: "+divide);
        return divide;
    }

    //Modulo two parameters
    public int modulo(int a, int b){
        int modulo = a % b;
        System.out.println("Wynik modulo to: "+modulo);
        return modulo;
    }

    public static void main(String[] args){
        Calculator myCalculator = new Calculator();
        myCalculator.add(5, 7);
        myCalculator.subtract(45, 11);

    }
}