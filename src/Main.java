import java.text.DecimalFormat;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //Дисклеймер: пошерстил в интернете, что в Java есть такое понятие, как поток, с помощью которого можно решить
        // задачи в 2-3 строчки. Но так как задачи связаны с циклами, я сделал их с помощью циклов.
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

    static void task1()
    {
        System.out.println("Задание 1");

        int[] arr = generateRandomArray();
        //int sum = IntStream.of(arr).sum();

        int sum = 0;

        for (var element: arr)
        {
          sum += element;
        }

        System.out.println("Сумма трат за месяц составила "+ new DecimalFormat("###,###,###").format(sum)+ " рублей.");
        System.out.println("---\n");
    }

    static void task2()
    {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        /*
        int min = IntStream.of(arr).min().getAsInt();
        int max = IntStream.of(arr).max().getAsInt();
        */
        int min;
        int max;
        min = max = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                continue;
            }
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ new DecimalFormat("###,###,###").format(min) + " рублей. " +
                "Максимальная сумма трат за день составила " + new DecimalFormat("###,###,###").format(max) +" рублей.");
        System.out.println("---\n");
    }

    static void task3()
    {
        System.out.println("Задание 3");

        int[] arr = generateRandomArray();
        //double avg = IntStream.of(arr).average().getAsDouble();

        double avg = 0;

        for (var element: arr)
        {
            avg += element;
        }
        avg /= arr.length;

        System.out.println("Средняя сумма трат за месяц составила " + new DecimalFormat("###,###,###.###").format(avg)
                + " рублей.");
        System.out.println("---\n");
    }

    static void task4()
    {
        System.out.println("Задание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for(int i = reverseFullName.length-1; i >= 0; i --)
        {
            System.out.print(reverseFullName[i]);
        }
    }
}