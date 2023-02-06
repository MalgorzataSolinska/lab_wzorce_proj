package pl.edu.wszib.lab1.builder.record;

import pl.edu.wszib.lab1.builder.Address;

public class PersonFactory {
  public Person male(String firstName, String lastName, int age, Address address) {
    return Person.male(firstName, lastName,  age,  address);
  }

  public Person female(String firstName, String lastName, int age, Address address) {
    return Person.female(firstName, lastName, age, address);
  }
}
