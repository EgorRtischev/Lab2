import java.io.PrintStream;
import java.util.Scanner;
public class laba2_zadanie4 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args){
        // Вводим n с клавиатуры
        int n = in.nextInt();
        // Создаём переменную current_number для хранения текущего числа и 
        //               вспомогательный boolean flag
        int current_number = 0;
        boolean flag = false;
        // Создаём массив для хранения числа вхождений чисел
        int [] numbers = new int[91];
        for (int i = 0; i < n; i++){
            current_number = in.nextInt();
            numbers[current_number - 10] += 1; 
        }
        for (int i = 0; i <= 90; i++){
            if (numbers[i] == i + 10){
                out.print((i + 10) + " ");  
                flag = true;  
            }
        }
        if (!flag){
            out.print("NO");
        }
    }
}
