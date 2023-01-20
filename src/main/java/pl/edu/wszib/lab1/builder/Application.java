package pl.edu.wszib.lab1.builder;

public class Application {

  public static void main(String[] args) {
    Person.Builder personBuilder = Person.builder()
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
  }
}
