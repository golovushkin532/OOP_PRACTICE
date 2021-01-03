package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

public class TaskOneFourteen {
    public static void main(String[] args) {
        Person person = new Person(); // создали Аркадия
        person.setFirstName("Arkadiy");
        checkAnotherPerson();
        //Выводим погулять судью Игната вызовом метода написанным позже
        System.out.println(person.getFirstName());
        //Аркадий вышел
    }

    private static void checkAnotherPerson() {
        // а Аркадий не будет гулять тут, здесь инициализировался Игнат
        Person person = new Person();// создали Игната
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
        //Игнат вышел
    }

}
