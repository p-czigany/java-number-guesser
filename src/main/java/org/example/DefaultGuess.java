package org.example;

import java.util.Scanner;

public final class DefaultGuess implements Guess {
  @Override
  public int number() {
    System.out.print("Give me a number between 0 and 99: ");
    return new Scanner(System.in).nextInt();
  }
}
