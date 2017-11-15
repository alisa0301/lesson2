package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Работа с массивами
         */
        int[] cats = new int[5]; //создание массива, длина фиксирована
        int cats2[] = {1, 2, 3};  // создание массива, вариант 2
        cats[2] = 3; //обращение к элементу массива
        int length = cats.length; // длина массива
        int[][] doubleArray = {
                {1, 2, 3},
                {4, 5, 6}
        }; // Пример создания многомерного массива
        //можно почитать про методы класса Arrays https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

        /**
         * Синтаксис. Циклы
         */
        //Конструкция switch
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            default:
                System.out.println("я умею считать только до двух");
                break;
        }

        //цикл for
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " Миссисипи");
        }

        //цикл foreach
        for (int member : arr) {
            System.out.println(member + " Миссисипи");
        }

        //цикл while
        int counter = 5;
        while (counter > 0) {
            System.out.println("Осталось " + counter + " сек.\n");
            counter--;
        }

        /**
         Класс String - для более подробного изучения можно прочитать:
         https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
         */

        String student = "грустный Леонид"; //наиболее простой вариант создания строки

        byte[] bytes = Files.readAllBytes(Paths.get("src/com/company/cats.txt"));
        String strFromFile = new String(bytes, "UTF-8");  //пример создания с помощью конструктора, подробнее про варианты создания можно почитать javadoc
        System.out.println("strFromFile = " + strFromFile);


        String exampleStr = "   печальный Леонид,весёлый Стас    ";

        String trimmedStr = exampleStr.trim();   // удаляет пробелы до и после
        System.out.println("trimmedStr = " + trimmedStr);

        String upperCaseStr = trimmedStr.toUpperCase(); // приведение к верхнему регистру, обратная операция - toLowerCase
        System.out.println("upperCaseStr = " + upperCaseStr);

        String concatStr = upperCaseStr + ",ПУШИСТАЯ КИСОНЬКА"; // конкатинация строк, другой вариант - использование метода concat
        System.out.println("concatStr = " + concatStr);

        String replacedStr = concatStr.replace("ЛЕОНИД", "ЦАРЬ ЛЕОНИД"); // замена подстроки
        System.out.println("replacedStr = " + replacedStr);

        String arrStr[] = replacedStr.split(","); // нарезает строку по указанному разделителю
        for(String str: arrStr) {
            System.out.println(str);
        }

        replacedStr.isEmpty(); // возвращает true, если строка пустая
        replacedStr.contains("ЛЕОНИД"); //возвращает true, если в строке содержится указанная подстрока
        replacedStr.indexOf('Л'); //определяет индекс вхождения, lastIndexOf - последний индекс вхождения

        String intStr = String.valueOf(42); //возвращает строковое представление аргумента, в данном случае - int
        System.out.println("Ответ на вопрос жизни, вселенной и всего такого: " + intStr);

        String formatStr  = String.format("Однажды %s и %s считали ворон и насчитали целых %d", "Леонид", "Стас", 17); //форматирование строк
        System.out.println("formatStr = " + formatStr);
    }
}
