package com.basic.function;

import java.util.function.IntConsumer;

public class ConsumerTest {

  public static void main(String[] args) {
    IntConsumer print = t -> System.out.println(t);
    IntConsumer and = t -> System.out.println(t);
    print.accept(5);
    print.andThen(and).accept(5);
  }

}
