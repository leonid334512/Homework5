public class Main {
    public static void main(String[] args) {
        // задача 1
        int clientOs = 0;
        int clinetIos = 0;
        int clientAndr = 1;
        if (clientOs == clinetIos) {
            System.out.println("Установите версию для Ios");
        } else if (clientOs == clientAndr) {
            System.out.println("Установите версию для Android");
        } else {
            System.out.println("Нет такой версии");
        }
        // задача 2
        int year = 2015;
        int clientDeviceYear = 2017;
        if (clientOs == clinetIos  && clientDeviceYear < year) {
            System.out.println("Установите облегченную версию для ios");
        } else if (clientOs == clinetIos && clientDeviceYear >= year) {
            System.out.println("Установите версию для ios");
        } else if (clientOs == clientAndr && clientDeviceYear < year) {
            System.out.println("Установите облегченную версию для android");
        } else {
            System.out.println("Установите версию для android");
        }
        // задача 3
        int Year = 2028;
        if (Year > 1584 && Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год является не високосным");
        }
        // задача 4
        int deliveryDistance = 140;
        int day = 1;
        if (deliveryDistance > 20) {
            day++;
        }
        if (deliveryDistance > 60) {
            day++;
        }
        if (deliveryDistance > 100) {
            day = -1;
        }
        if (day == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется " + day + " дня");
        }
        // задача 5
        int monthNumber = 5;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("зима");
                break;
            case 3, 4, 5:
                System.out.println("весна");
                break;
            case 6, 7, 8:
                System.out.println("лето");
                break;
            case 9, 10, 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("не правельный месяц");
        }

    }
}