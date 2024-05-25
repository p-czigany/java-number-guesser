package org.example;

public class Main {

  public static void main(String[] args) {
    SecretNumber secretNumber = new DefaultSecretNumber();
    new DefaultResult(
            new DefaultAttempts(
                new VerbalizedDifference(new NumericDifference(secretNumber, new DefaultGuess())),
                6),
            secretNumber)
        .say();
  }
}
