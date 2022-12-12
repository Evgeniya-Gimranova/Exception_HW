import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Task_04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner((System.in));
        System.out.println("Введите любой текст ");
        reader.close();
        try {
            String result = reader.nextLine();
            if(result.equals("")) throw new RuntimeException("Пустую строку вводить нельзя");

            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    } 
    }

