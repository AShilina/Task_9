import java.util.Scanner; // импорт сканера

public class Task_9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // пользователь задает длину массива, создание массива нужной длины
        System.out.println("Задайте размер массива:");
        int array_size = in.nextInt();
        int[] myList = new int[array_size];

        // ввод данных в массив пользователем
        for (int a = 0; a < myList.length; a++)
        {
            System.out.println("Введите значение для ячейки " + a +":");
            myList[a] = in.nextInt();
        }

        // вывести на экран все элементы массива, умноженные на два
        System.out.println("Элементы созданного массива, умноженные на два:");
        for (int i = 0; i < myList.length; i++)
        {
            System.out.println("Ячейка " + i + ": " + myList[i] * 2);
        }
    }
}