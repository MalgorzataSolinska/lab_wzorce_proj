package pl.edu.wszib.lab1.builder;

import com.google.auto.value.AutoBuilder;

import java.util.Objects;

public record MyRecord(
    String myVar,
    String myNewVar
){
  @AutoBuilder()
  interface Builder{
    Builder myVar(String myVar);
    Builder myNewVar (String myNewVar);

    MyRecord build();
  }
}
