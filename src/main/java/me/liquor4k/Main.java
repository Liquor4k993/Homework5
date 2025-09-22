package me.liquor4k;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        //Определение ОС
        int clientOS = 0; // 0 - iOS, 1 - Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("\nЗадание 2");
        //Определение ОС с учетом года
        int clientOS2 = 1; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2015;

        boolean isOldDevice = clientDeviceYear < 2017;

        if (clientOS2 == 0 && isOldDevice) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && isOldDevice) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("\nЗадание 3");
        //Високосный год
        int year = 2024;

        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        if (year <= 1584) {
            System.out.println(year + " год: високосные годы были введены после 1584 года");
        } else if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("\nЗадание 4");
        //Доставка карт
        int deliveryDistance = 95;
        int deliveryDays = 1; // минимальный срок доставки

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance > 60) {
            deliveryDays += 2; // +1 за интервал 20-60 и +1 за интервал 60-100
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20) {
            deliveryDays += 1; // +1 за интервал 20-60
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        System.out.println("\nЗадание 5");
        //Определение сезона по месяцу
        int monthNumber = 7;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону осень");
                break;
            default:
                System.out.println("Некорректный номер месяца: " + monthNumber);
        }
    }
}