import java.io.PrintStream;
import java.util.Scanner;
public class laba2_zadanie3 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args){
        // Вводим с клавиатуры вводные данные 
        int P0 = in.nextInt();
        int g = in.nextInt();
        int m = in.nextInt();
        int Cap = in.nextInt();

        // Создаём переменную P_current, где будем хранить текущую численность населения
        // (можно было хранить её в P0, но для лучшей читабельности создал лишнюю перемнную)
        int P_current = P0;
        // Создаём переменную, где будем хранить текущее количество лет, прошедших с точки отсчёта
        int number_of_years = 0;
        while (P_current < Cap){
            // Применяем формулу, указанную в условии задачи
            P_current += P_current * g / 100;
            if (P_current < Cap){
                number_of_years += 1;
            }
            P_current += m;
        }
        P_current = Cap;
        out.print(number_of_years + " " + P_current);
    }
}