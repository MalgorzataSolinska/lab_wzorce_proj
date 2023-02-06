package pl.edu.wszib.lab1.builder.record;

import pl.edu.wszib.lab1.builder.Address;
import pl.edu.wszib.lab1.builder.Gender;
import pl.edu.wszib.lab1.builder.MyRecord;

public class Application {

  public static void main(String[] args) {
    Person male = Person.male(
        "Grzegorz",
        "Solins",
        30,
        new Address("Krakow", "dd", "ddda3", "asdjhbf"));
    Person female = Person.female(
        "Malgorzata",
        "Solins",
        30,
        new Address("Krakow", "dd", "ddda3", "asdjhbf"));


    final PersonFactory personFactory = new PersonFactory();
    personFactory.male(
        "Grzegorz",
        "Solins",
        30,
        new Address("Krakow", "dd", "ddda3", "asdjhbf"));

    personFactory.female(
        "Malgorzata",
        "Solins",
        30,
        new Address("Krakow", "dd", "ddda3", "asdjhbf"));

  }
}
