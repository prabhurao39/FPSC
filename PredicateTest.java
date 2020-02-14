package com.basic.function;

import java.util.function.*;


/**
 * takes input T and returns boolean SAM 1. test
 * 
 * and negate or equal
 * 
 * 
 */
public class PredicateTest {
  public static void main(String[] args) {
    Predicate<Integer> pre = t -> (t > 0);
    Predicate<Integer> and = pre.and(t -> t > 5);
    System.out.println(pre.and(and).test(51));
  }
}



class IntPredicateTest {
  static IntPredicate inFn = t -> t == 5;
  public static void main(String[] args) {
    System.out.println(inFn.test(5));
  }
}
