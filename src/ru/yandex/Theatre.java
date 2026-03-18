package ru.yandex;

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Татьяна", "Афанасьева", Gender.FEMALE, 172);
        Actor actor2 = new Actor("Сергей", "Басов", Gender.MALE, 178);
        Actor actor3 = new Actor("Тимур", "Гарипов", Gender.MALE, 182);

        Director director1 = new Director("Алексей", "Доронин", Gender.MALE, 30);
        Director director2 = new Director("Максим", "Астафьев", Gender.MALE, 1);

        Person musicAuthor = new Person("Андрей", "Беляев", Gender.MALE);
        Person choreographer = new Person("Андрей", "Заостровский", Gender.MALE);

        ArrayList<Actor> theatricalListOfActors = new ArrayList<>();
        theatricalListOfActors.add(actor1);
        theatricalListOfActors.add(actor2);

        ArrayList<Actor> operaListOfActors = new ArrayList<>();
        operaListOfActors.add(actor2);
        operaListOfActors.add(actor3);

        ArrayList<Actor> balletListOfActors = new ArrayList<>();
        balletListOfActors.add(actor1);
        balletListOfActors.add(actor3);

        Show theatrical = new Show("Герой нашего времени", 170, director1, theatricalListOfActors);
        Ballet ballet = new Ballet("Дон кихот", 160, director2, balletListOfActors, musicAuthor,
                "Балет в 3-х действиях", choreographer);
        Opera opera = new Opera("Кармен", 200, director1, operaListOfActors, musicAuthor,
                "Опера в 3-х действиях", 26);

//      Выведем списки актеров по каждому спектаклю
        theatrical.getListOfActors();
        ballet.getListOfActors();
        opera.getListOfActors();

//      Заменим актера в театральной постановки на актера из другой постановки
        theatrical.replaceActor(actor3, "Афанасьева");
        theatrical.getListOfActors();

//      Попробуем заменить в спектакле несуществующего актера
        ballet.replaceActor(actor1, "Иванов");

//      Выведем текст либретто для музыкальных представлений
        System.out.println(opera.getLibrettoText());
        System.out.println(ballet.getLibrettoText());

//      Выведем имя и фамилию директора одной из постановок
        theatrical.printDirector();
    }
}
