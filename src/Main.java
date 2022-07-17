public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        {
            //задание1
            int clientOs = 0;
            if (clientOs == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOs == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("под такую ОС нет приложения");
            }
        }

        { //ЗАДАНИЕ2

            int clientDeviceYear = 2017;
            int clientOs = 0;
            if (clientOs == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите новую версию для Ios");
            } else if (clientOs == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите старую версию для Ios");
            } else if (clientOs == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите новую версию для Android");
            } else if (clientOs == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите старую версию Android");
            } else {
                System.out.println("Ваше устройство не поддерживается");
            }

        }


// задание 3
        int year = 2021;
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "это высокосный год");
        }else {
            System.out.println(year + "это не високосный год");
        }
    }
//задание 4

}

