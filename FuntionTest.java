package com.basic.function;

import java.util.function.Function;
import java.util.function.IntFunction;

public class FuntionTest {
  public static void main(String[] args) {

    Function<Integer, Integer> function1 = t -> (t - 5);
    Function<Integer, Integer> function2 = t -> (t * 2);

    // using apply method
    System.out.println(function1.apply(10));
    System.out.println(function2.apply(9));

    // Using andThen() method
    int a = function1.andThen(function2).apply(50);
    System.out.println(a);

    // Using compose function
    int c = function1.compose(function2).apply(50);
    System.out.println(c);

  }
}


class IntFunctionTest {
  static IntFunction<Integer> inFn = t -> t + 5;

  public static void main(String[] args) {
    System.out.println(inFn.apply(10));
  }
}
