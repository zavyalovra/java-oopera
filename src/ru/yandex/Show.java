package ru.yandex;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void getListOfActors() {
        System.out.println("Представление: " + title);
        System.out.println("Список актеров: ");
        for (Actor actor : listOfActors) {
            System.out.println(actor.name + " " + actor.surname + ", (" + actor.height + " см)");
        }
        System.out.println("---");
    }

    public void addActorToList(Actor newActor) {
        if (listOfActors != null) {
            for (Actor actor : listOfActors) {
                if (actor.equals(newActor)) {
                    System.out.println("Такой актер уже есть в списке");
                    return;
                }
            }
            listOfActors.add(newActor);
        } else {
            System.out.println("Список актеров пуст");
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        boolean isActorExist = false;
        int indexOfActor = 0;
        System.out.println("Представление: " + title + " - замена актера " + surname + " на " + newActor.surname);
        if (listOfActors != null) {
            for (Actor actor : listOfActors) {
                if (actor.surname.equals(surname)) {
                    isActorExist = true;
                    indexOfActor = listOfActors.indexOf(actor);
                }
            }
            if (isActorExist) {
                listOfActors.remove(indexOfActor);
                listOfActors.add(newActor);
                System.out.println("Актер успешно заменён");
            } else {
                System.out.println("Актер, для которого производится замена, не найден");
            }
        } else {
            System.out.println("Список актеров пуст");
        }
    }

    @Override
    public String toString() {
        String result = "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director;

        if (listOfActors != null) {
            result = result + ", listOfActors.size=" + listOfActors.size() + "}";
        } else {
            result = result + ", listOfActors=null}";
        }

        return result;
    }
}
