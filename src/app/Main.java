package app;

public class Main {


    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("Квадрат числа " + number + " дорівнює " + square + ".");
    }


    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }


    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }


    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }


    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }


    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Введіть ціле число: 5");
        printSquare(5);

        double radius = 3.5;
        double height = 10.0;
        System.out.println("\n2. Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + calculateCylinderVolume(radius, height) + ".");

        int[] array = {10, 20, 30, 40, 50};
        int sum = sumArray(array);
        System.out.println("\n3. Масив чисел: [10, 20, 30, 40, 50]");
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

        String inputString = "Hello, World!";
        String reversedString = reverseString(inputString);
        System.out.println("\n4. Введіть рядок: " + inputString);
        System.out.println("Рядок в зворотньому порядку: " + reversedString);

        int a = 2;
        int b = 3;
        int powerResult = power(a, b);
        System.out.println("\n5. Введіть a: " + a);
        System.out.println("Введіть b: " + b);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + powerResult + ".");

        int n = 4;
        String text = "Java програмування";
        System.out.println("\n6. Введіть ціле число n: " + n);
        System.out.println("Введіть текстовий рядок: " + text);
        printTextNTimes(n, text);
    }
}
