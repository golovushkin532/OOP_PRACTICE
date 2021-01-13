package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

import java.io.Serializable;

public class Person implements Serializable{
    private String firstName;
    private String lastName;
    private int passportId;
    Gender gender;

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassportId() {
        return passportId;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public Person() {

    }

    public Person(String firstName, String lastname, int passportId, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.passportId = passportId;
        this.gender = gender;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public String exceptionPerson(Person person) {
        return person.toString();
    }


    static class Task1 {
        public static void main(String[] args) {
            Person man = new Person();
            Person dog = new Person();
            man.setFirstName("Pastor");
            man.setLastName("Napas");
            man.setPassportId(74);
            dog.setFirstName("Rocky");
            dog.setLastName("Flaco");
            dog.setPassportId(39);
            System.out.println(man.getFirstName() + " " + man.getLastName() + " " + "Паспорт:" + man.getPassportId());
            System.out.println(dog.getFirstName() + " " + dog.getLastName() + " " + "Паспорт:" + dog.getPassportId());
        }
    }
}
