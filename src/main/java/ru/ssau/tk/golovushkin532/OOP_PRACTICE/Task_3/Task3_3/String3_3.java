package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_3;

public class String3_3 {
    public static void main(String[] args) {
        String str = "kalis";
        String str2 = new String(str);
        if (str == str2) {
            System.out.println("Строки равны по оператору ==");
        }
        if (str.equals(str2)) {
            System.out.println("Строки равны по методу equals()");
        }
    }
}
