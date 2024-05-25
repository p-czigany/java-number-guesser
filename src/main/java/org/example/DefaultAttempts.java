package org.example;

public final class DefaultAttempts implements Attempts {
  private final Difference difference;
  private final int maxTries;

  public DefaultAttempts(Difference difference, int maxTries) {
    this.difference = difference;
    this.maxTries = maxTries;
  }

  @Override
  public boolean matches() {
    int counter = 1;
    while (counter <= maxTries && difference.number() != 0) {
      ++counter;
    }
    return counter <= maxTries;
  }
}
