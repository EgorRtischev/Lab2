import java.io.PrintStream;
import java.util.Scanner;
public class laba2_zadanie1 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    
    // Подпрограмма для подсчёта суммы цифр в числе

    public static int sumDigit(int n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args){
        // Вводим первый элемент последовательности и количество элементов

        int a_0 = in.nextInt();
        int n = in.nextInt();

        // Создаём переменную previous, где будем хранить предыдущий член последовательности
        int previous = a_0;

        // Создаём переменную current, где будем хранить текущий член последовательности
        int current = 0;

        // Создаём последовательность и выводим её на экран 
        for (int i = 1; i <= n; i++){
            current = sumDigit(previous) * 2;
            out.print(current + " ");
            previous = current;
        }
    }
}
