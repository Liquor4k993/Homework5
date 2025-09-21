package me.liquor4k;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        //Определение ОС
        int clientOS = 0; // 0 - iOS, 1 - Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }

        System.out.println("\nЗадание 2");
        //Определение ОС с учетом года
        int clientOS2 = 1; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2015;

        if (clientOS2 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS2 == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Неизвестная операционная система");
        }

        System.out.println("\nЗадание 3");
        //Високосный год
        int year = 2024;

        if (year <= 1584) {
            System.out.println(year + " год: високосные годы были введены после 1584 года");
        } else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}