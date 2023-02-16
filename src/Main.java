public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryPeriod1 = 1;
        int deliveryPeriod2 = 2;
        int deliveryPeriod3 = 3;

        if (deliveryDistance <= 100) {
            if (deliveryDistance <= 20)
                System.out.println("Потребуется дней: " + deliveryPeriod1);
            if (deliveryDistance > 20 && deliveryDistance <= 60)
                System.out.println("Потребуется дней: " + deliveryPeriod2);
            if (deliveryDistance > 60 && deliveryDistance <= 100)
                System.out.println("Потребуется дней: " + deliveryPeriod3);
        }
        else
            System.out.println("Доставки нет");
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
                System.out.println("Сезон: Зима");
                break;
            case 2:
                System.out.println("Сезон: Зима");
                break;
            case 3:
                System.out.println("Сезон: Весна");
                break;
            case 4:
                System.out.println("Сезон: Весна");
                break;
            case 5:
                System.out.println("Сезон: Весна");
                break;
            case 6:
                System.out.println("Сезон: Лето");
                break;
            case 7:
                System.out.println("Сезон: Лето");
                break;
            case 8:
                System.out.println("Сезон: Лето");
                break;
            case 9:
                System.out.println("Сезон: Осень");
                break;
            case 10:
                System.out.println("Сезон: Осень");
                break;
            case 11:
                System.out.println("Сезон: Осень");
                break;
            case 12:
                System.out.println("Сезон: Зима");
                break;
            default:
                System.out.println("Условие невыполнимо");
        }
    }
}
