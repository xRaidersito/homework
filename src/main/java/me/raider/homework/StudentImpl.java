package me.raider.homework;

import java.util.function.Consumer;

public class StudentImpl implements Student {

    private Consumer<Student> consumer;

    private final int age;
    private final String name;

    public StudentImpl(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void message() {
        if (consumer != null) {
            consumer.accept(this);
        } else {
            System.out.println("No tengo mensaje :c");
        }
    }

    @Override
    public void setMessage(Consumer<Student> consumer) {
        this.consumer = consumer;
    }
}
