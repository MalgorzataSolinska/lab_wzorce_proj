package pl.edu.wszib.lab1.builder.record;

import com.google.auto.value.AutoBuilder;
import pl.edu.wszib.lab1.builder.MyRecord;

record Address (
   String city,
   String street,
   String number,
   String postalCode
) {

  static Builder builder(){
    return new AutoBuilder_Address_Builder();
  }

  @AutoBuilder
  interface Builder{
    Builder city(String city);
    Builder street (String street);
    Builder number (String number);
    Builder postalCode (String postalCode);
    Address build();
  }
}
