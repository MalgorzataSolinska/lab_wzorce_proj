package pl.edu.wszib.lab1.builder.autobuilder;

import com.google.auto.value.AutoValue;

public class Application {
  public static void main(String[] args) {
   Address address = Address.builder()
       .city("Krakow")
       .postalCode("32-424")
       .number("93a")
       .street("Radzikowskiego")
       .build();

    Person person = Person.builder()
        .age(18)
        .firstName("Malgorzata")
        .lastName("Solinska")
        .gender(Gender.FEMALE)
        .address(address)
        .build();

    //Metody wytworcze
//    Person.create();
//    Person.male();
//    Person.female();
    System.out.println(person);
  }
}
