package com.basic.function;

import java.util.function.Supplier;
import java.util.Date;
import java.util.Random;
import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;

public class SupplierTest {

  public static void main(String[] args) {
    Supplier<String> host = () -> "10.198.23.175";
    Supplier<Date> date = () -> new Date();
    System.out.println("host name :  " + host.get() + "     today date : " + date.get());
  }

}


class Java8SupplierExample {
  public static void main(String[] args) {
    Supplier<Integer> randomNumbersSupp = () -> new Random().nextInt(10);
    Stream.generate(randomNumbersSupp).limit(5).forEach(System.out::println);
  }

}


class Exercise {
  public static void main(String[] args) {
    Supplier<String> s = () -> {
      // password is a combination of capital letters, small letters, special symbols and numbers.
      // And the password length should have at least 9 digits.
      String[] bigAlphabets = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
          "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
      String[] smallAlphabets = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
          "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "Z"};
      String[] specialSymbols = new String[] {"!", "@", "#", "$", "%", "^", "&", "*", "?"};
      return bigAlphabets[ThreadLocalRandom.current().nextInt(0, 26)]
          + specialSymbols[ThreadLocalRandom.current().nextInt(0, 9)]
          + ThreadLocalRandom.current().nextInt(0000, 9999)
          + specialSymbols[ThreadLocalRandom.current().nextInt(0, 9)]
          + smallAlphabets[ThreadLocalRandom.current().nextInt(0, 26)]
          + smallAlphabets[ThreadLocalRandom.current().nextInt(0, 26)];
    };

    System.out.println("Password 1 : " + s.get());
    System.out.println("Password 2 : " + s.get());
    System.out.println("Password 3 : " + s.get());
  }
}
