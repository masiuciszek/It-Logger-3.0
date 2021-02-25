package com.company.masiu;

import java.util.Arrays;

public class Main {

  private static void printXs(int[] xs) {
    Arrays.stream(xs).forEach(s -> System.out.println(s));
  }

  static int[] even(int[] xs) {

    return Arrays.stream(xs).filter(n -> n % 2 == 0).toArray();
  }

  public static void main(String[] args) {
    int[] xs = {1, 2, 3, 4, 5};

    int[] evens = even(xs);

    Dog bobbie = new Dog("bobbie", "Dog", 4);
    int a = 99;
    int b = 1;

    System.out.println(a);


    mutateInt(a,24);
    System.out.println(a);
    Animal.greet();
  }

  static int addition(int a, int b) {
    return a + b;
  }

  static int sumList(int[] xs) {
    int res = 0;
    for (int x : xs) {
      res += x;
    }
    return res;
  }

  static int sumWithForEach(int[] xs) {
    int res = Arrays.stream(xs).sum();
    return res;
  }

  static void mutateInt(int x,int target){
    x = target;
  }

  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }

  static String reverseString(String s) {
    String reversed = "";
    char[] xs = s.toCharArray();
    for (int i = 0; i < xs.length; i++) {
      char foo = xs[i];
      reversed = foo + reversed;
    }
    return reversed;
  }
}