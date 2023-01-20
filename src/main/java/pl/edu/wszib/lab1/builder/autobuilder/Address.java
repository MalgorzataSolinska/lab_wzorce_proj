package pl.edu.wszib.lab1.builder.autobuilder;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Address {
  abstract String city();

  abstract String street();

  abstract String number();

  abstract String postalCode();

  public static Builder builder(){
    return new AutoValue_Address.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Address.Builder city (String city);
    public abstract Address.Builder street (String street);
    public abstract Address.Builder number (String number);
    public abstract Address.Builder postalCode (String postalCode);

    public abstract Address build();
  }
}