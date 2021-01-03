package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

public class TaskOneThirteen {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt();
        checkPerson(person);
        System.out.println(number);
        //Выводится 5 т.к. в checkint() изменялась лишь копия number
        System.out.println(person.getFirstName());
        /*Выводится Олег т.к. объект Person ссылается на  данные которые он получил,
        потому что в функцию chekPerson() передалась копия адреса объекта*/
    }

    private static void checkInt() {
        int number = 10;
        System.out.println(number);
        //Выводится 10 из-за создания копии number = 10
    }

    private static void checkPerson(Person person) {
        person.setFirstName("Oleg");
        System.out.println(person.getFirstName());
        //Выводится Олег т.к. передалась копия ссылки на объект Person
    }

}
