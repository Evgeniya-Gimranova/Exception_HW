
// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно 
// приводить к падению приложения, вместо этого, 
// необходимо повторно запросить у пользователя ввод данных.
import java.util.*;

public class Task_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean user = true;
        while (user == true) {
            System.out.print("Введите дробное число: ");
            String num = input.nextLine();
            try {
                float floatNum = Float.parseFloat(num);
                user = false;
                System.out.println("Ваше число: " + floatNum);
            } catch (NumberFormatException e) {
                System.out.println("Введённое число не дробное! \n Повторите ввод:");
            }
        }
    }
}
