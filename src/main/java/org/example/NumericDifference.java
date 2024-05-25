package org.example;

public final class NumericDifference implements Difference {
  private final SecretNumber secretNumber;
  private final Guess guess;

  public NumericDifference(SecretNumber secretNumber, Guess guess) {
    this.secretNumber = secretNumber;
    this.guess = guess;
  }

  @Override
  public int number() {
    return guess.number() - secretNumber.number();
  }
}
