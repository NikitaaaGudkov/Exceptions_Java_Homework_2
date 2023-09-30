// 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
// Ввод текста вместо числа не должен приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
import java.util.InputMismatchException;
import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        System.out.println("Вы ввели: " + GetNumber());
    }

    public static float GetNumber() {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean isNumber = false;
        while(!isNumber) {
            try {
                System.out.println("Введите дробное число");
                number = scanner.nextFloat();
                isNumber = true;
            }
            catch(InputMismatchException ex) {
                System.out.println("Вы ввели не дробное число! Попробуйте ещё раз. В качестве разделителя необходимо ввести запятую");
                scanner.next();
            }
        }
        scanner.close();
        return number;
    }
}

