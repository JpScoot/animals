package com.tlglearning.animals;

public class Main {

  public static void main(String[] args) {
    new Dog();
    /*
    0. class initialization of Wolf superclass (Object) - object is already in memory
    1. class initialization of Wolf
    2. class initialization of Dog
    (2a). Object's initialization of Dog instance
    3. Wolf's initialization of Dog instance
    4. Dog's initialization of Dog instance
     */
  }

}
