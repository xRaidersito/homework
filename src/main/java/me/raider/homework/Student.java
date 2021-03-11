package me.raider.homework;

import java.util.function.Consumer;

public interface Student {

    String getName();

    int getAge();

    void message();

    void setMessage(Consumer<Student> consumer);

}
