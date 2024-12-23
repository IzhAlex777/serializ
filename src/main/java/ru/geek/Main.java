package ru.geek;

import ru.geek.entity.Person;
import ru.geek.service.PersonSerializ;
import ru.geek.service.PersonService;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PersonService personService = new PersonService();
        Person person = new Person(1, "Sasha", 45);
        PersonSerializ personSerializ = new PersonSerializ();
        //personSerializ.serialPerson(person);
        personSerializ.deserialPerson(person);
        //System.out.println("Hello world!");
        personService.savePerson(person);
        Thread.sleep(1000);
        personService.findPerson(1);
        Thread.sleep(1000);
        personService.updatePerson(new Person(1, "Sasha", 47));
        Thread.sleep(1000);
        personService.findPerson(1);
        personService.deleteUser(person);
        Thread.sleep(1000);
        personService.findPerson(1);
    }
}