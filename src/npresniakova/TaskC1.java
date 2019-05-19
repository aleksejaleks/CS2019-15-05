package npresniakova;

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        sc.close();
        System.out.print( "Вывод:");
        System.out.print("Sum = " + c);

    }
}
