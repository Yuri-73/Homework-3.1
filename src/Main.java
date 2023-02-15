public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0)
           System.out.println("Установите версию приложения для IOS по ссылке");
        else
           if (clientOS == 1)
              System.out.println("Установите версию приложения для Android по ссылке");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015) {
            if (clientOS == 0)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else if (clientOS == 1)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            if (clientOS == 0)
                System.out.println("Установите версию приложения для IOS по ссылке");
            else if (clientOS == 1)
                System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2004;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println(year + " год является високосным");
                else
                    System.out.println(year + " год не является високосным");
            }
            else
               System.out.println(year + " год является високосным");
        }
        else
            System.out.println(year + " год не является високосным");
    }
}
