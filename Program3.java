// 3. Дан следующий код, исправьте его там, где требуется (задание 3 
// https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
public class Program3 {
    public static void main(String[] args) {
        int a = 90;
        int b = 3;
        if (b == 0) {
            System.out.println("Делить на ноль нельзя");
        } else {
            System.out.println(a / b);
        }
        printSum(23, 234);
        int[] abc = { 1, 2 };
        int index = 3;
        if (index < 0 || index >= abc.length) {
            System.out.println("Недопустимый индекс для заданного массива");
        } else {
            abc[index] = 9;
        }
    }
        
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
