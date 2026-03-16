package ru.yandex;

public class Person {
    protected String name;
    protected String surname;
    public Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}
