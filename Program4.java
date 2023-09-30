// 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        scanner.close();
        if (str.length() == 0) {
            throw new Exception("Пустые строки вводить нельзя");
        }
        System.out.println("Вы ввели: " + str);
    }
}
