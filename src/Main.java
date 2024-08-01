public class Main {
    public static boolean checkLeapYear(int year) {
        return (year > 1524 && (year % 4) == 0 && year % 100 != 0 || (year % 400 == 0));

    }
    public static String installSistem(int os, int yearProd) {
        int currentYear = 2015;
        String msg = " Установите %s версию приложения для %s  по ссылке ";
        String osName = os == 0 ? "iOs" : "Android";
        String version = yearProd >= currentYear ? "" : "облегченую";
        return String.format(msg, version, osName);
    }


    public static void countDay(int deliveriDistance) {
        if (deliveriDistance <= 100) {
            if (deliveriDistance <= 20) {
                System.out.println(" Доставка в пределах" + deliveriDistance + " км. занимает сутки.");
            } else if (deliveriDistance > 20 && deliveriDistance < 60) {
                System.out.println(" Доставка в пределах" + deliveriDistance + " км. занимает двое суток.");
            } else if (deliveriDistance >= 60 && deliveriDistance < 100) {
                System.out.println(" Доставка в пределах" + deliveriDistance + " км. занимает трое суток.");
            }
        } else {
            System.out.println(" На такое расстояние не доставляем.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1.");
        int year = 2025;
        checkLeapYear(year);
        if (checkLeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задание 2.");
        System.out.println(installSistem(0, 2015));

        System.out.println(" Задание 3.");
        countDay(101);


    }
}