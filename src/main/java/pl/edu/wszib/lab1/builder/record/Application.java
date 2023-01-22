package pl.edu.wszib.lab1.builder.record;

import pl.edu.wszib.lab1.builder.Address;
import pl.edu.wszib.lab1.builder.Gender;
import pl.edu.wszib.lab1.builder.MyRecord;
import pl.edu.wszib.lab1.builder.Person;

public class Application {

  public static void main(String[] args) {
    pl.edu.wszib.lab1.builder.Person.Builder personBuilder = Person.builder()
        .firstName("Malgorzata")
        .lastName("Solinska")
        .age(30)
        .gender(Gender.FEMALE);
    Address address = personBuilder.addressBuilder()
        .city("lele")
        .number("ss")
        .postalCode("ssda")
        .street("ss")
        .build();
    personBuilder.address(address);

    new MyRecord("test", "testVol2");


  }
}
