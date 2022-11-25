// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
public class task_1 {    
    static int triangularNumber(int num){
        if (num == 1) return 1;
        int res = num + triangularNumber(num - 1);
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sc.close();
        System.out.print(triangularNumber(num));
    }
}

