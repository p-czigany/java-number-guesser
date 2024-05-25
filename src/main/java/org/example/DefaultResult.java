package org.example;

public final class DefaultResult implements Result {
  private final Attempts attempts;
  private final SecretNumber secretNumber;

  public DefaultResult(Attempts attempts, SecretNumber secretNumber) {
    this.attempts = attempts;
    this.secretNumber = secretNumber;
  }

  @Override
  public void say() {
    if (!attempts.matches()) {
      System.out.printf("You lose. The number was: %d%n", secretNumber.number());
    }
    System.out.println("Thanks for playing!");
  }
}
