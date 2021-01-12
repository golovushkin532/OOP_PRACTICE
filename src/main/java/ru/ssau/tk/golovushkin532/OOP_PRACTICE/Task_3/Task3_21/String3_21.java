package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_21;

public class String3_21 {
    public static void main(String[] args) {
        String str = "NAKEL";
        StringBuilder stringBuild = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                stringBuild.replace(i, i + 1, i + "");
            }
        }

        stringBuild.reverse();
        System.out.println(stringBuild.toString());
    }
}
