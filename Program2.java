// 2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
public class Program2 {
    public static void main(String[] args) {
        int d = 0;
        int[] intArray = new int[] { 1, 2, 3, 4, 5 };
        int index = 8;
        if (d == 0) {
            System.out.println("Делить на ноль нельзя");
        } else if (index < 0 || index >= intArray.length) {
            System.out.println("Недопустимый индекс для заданного массива");
        } else {
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);       
        }
    }
}
