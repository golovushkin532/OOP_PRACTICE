package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_6;

public class String3_6 {
    public void strings() {
        int i = 0;
        System.out.println("Символ\t№" + ++i); //табуляция
        System.out.println("Символ\b№" + ++i); //шаг назад
        System.out.println("Символ\n№" + ++i); //новая строка
        System.out.println("Символ\r№" + ++i); //возврат каретки
        System.out.println("Символ\'№" + ++i); //одна кавычка
        System.out.println("Символ\"№" + ++i); //две кавычки
        System.out.println("Символ/№" + ++i);
    }

    public static void main(String[] args) {
        String3_6 str = new String3_6();
        str.strings();
        //экранирование нужно для использования упровляющей последовательности в строке
    }
}
