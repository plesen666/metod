import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        public static void isYear (int year) {
            if (year > 1524 && (year % 4) == 0 && year % 100 != 0 || (year % 400 == 0)){
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
    public static void instalSistem (int os, int yearProd) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && yearProd == currentYear) {
            System.out.println("Установите версию приложения для Ios по ссылке");
        } else if (os == 0 && yearProd < currentYear) {
            System.out.println("Установите облегченную версию приложения для Ios по ссылке");
        } else if (os == 1 && yearProd == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (os == 1 && yearProd < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        }

        public static void countDay( int deliveriDistance){
            if (deliveriDistance<=100){
                if(deliveriDistance<20){
                    System.out.println( " Доставка в пределах" + deliveriDistance + " км. занимает сутки.");
                } else if ( deliveriDistance>=20 && deliveriDistance<60){
                    System.out.println( " Доставка в пределах" + deliveriDistance + " км. занимает двое суток." );
                } else if ( deliveriDistance >60&&deliveriDistance<=100) {
                    System.out.println( " Доставка в пределах" + deliveriDistance + " км. занимает трое суток." );
                }
            }else {
        System.out.println( " На такое расстояние не доставляем.");
                }
}

public static void main( String[]args){
    System.out.println( " Задание 1.");
    int year = 2025;
    isYear(year);
    System.out.println( " Задание 2.");
    instalSistem( 0 ,2015);
    System.out.println( " Задание 3.");
    countDay(101);


}
}