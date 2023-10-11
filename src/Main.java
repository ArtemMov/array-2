import javax.annotation.processing.Generated;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int summa = 0;
        int arr[] = generateRandomArray();
        for (int a : arr) {
            summa += a;
        }
        System.out.println("Сумма трат за месяц: " + summa);
    }

    public static void task2() {
        int arr[] = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
            System.out.println("Минимальные затраты за день: " + min);
            System.out.println("Минимальные затраты за день: " + max);
        }

    public static void task3() {
        int[] numberArray = generateRandomArray();
        int sum = 0;
        for (int i : numberArray) {
            sum += i;}
        System.out.println(sum / (float) numberArray.length);
        }
    public static void task4() {
        char[] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length - 1;i>=0; i--) {
            System.out.println(reverseFullName[i]);
        }
        }
    }
}