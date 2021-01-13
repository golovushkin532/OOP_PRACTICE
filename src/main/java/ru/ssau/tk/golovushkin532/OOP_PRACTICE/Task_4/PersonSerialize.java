package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4;

import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1.Person;

import java.io.Serializable;
import java.io.*;

public class PersonSerialize implements Serializable {
    public static void serialize(OutputStream outputStream, Object o) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(o);
        objectOutputStream.flush();
    }

    public static void main(String[] args) {
        try {
            serialize(new ByteArrayOutputStream(), new Person("Fast", "Al", 74));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
