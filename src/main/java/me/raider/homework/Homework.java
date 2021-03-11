package me.raider.homework;

public class Homework {

    public static void main(String... args) {

        Student studentOne = new StudentImpl("Juan", 12);

        studentOne.setMessage(student -> {
            System.out.println("Hola soy " + student.getName() + " y tengo " +  student.getAge() + " años, me encanta la cocina");
        });

        Student studentTwo = new StudentImpl("Rodrigo", 15);

        studentTwo.setMessage(student -> {
            System.out.println("Hola soy " + student.getName() + " y tengo " +  student.getAge() + " años, mi pasion son los videojuegos :DD");
        });

        studentOne.message();
        studentTwo.message();

    }

}
