// Реализовать простой калькулятор.

import java.util.Scanner;
public class task_3 {
    public static void main(String[] args){
        System.out.println("Hi! Let's calculate!");
        double x = getNumber();
        double y = getNumber();
        char operation = getOperation();
        double result = calc(x, y, operation);
        System.out.println(result);
        
    }
    
    public static double getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        double num;
        if(sc.hasNextDouble()){
            num = sc.nextDouble();
        } else {
            System.out.println("Wrong number! Try again!");
            sc.next();
            num = getNumber();
        }
        return num;
    }
    public static char getOperation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation (+, -, *, /): ");
        char operation;
        if(sc.hasNext()){
            operation = sc.next().charAt(0);
        } else {
            System.out.println("Error! Try again!");
            sc.next();
            operation = getOperation();
        }
        
        return operation;
        
    }
 
    public static double calc(double x, double y, char operation){
        double result;
        switch (operation){
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                System.out.println("Oops! Something went wrong! Please, try again!");
                result = calc(x, y, getOperation());
        }
        return result;
    }
}

