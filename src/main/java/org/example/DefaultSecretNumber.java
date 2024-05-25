package org.example;

import java.util.SplittableRandom;

public final class DefaultSecretNumber implements SecretNumber {
  private final int number;

  public DefaultSecretNumber() {
    this(new SplittableRandom().nextInt(0, 100));
  }

  public DefaultSecretNumber(int number) {
    this.number = number;
  }

  @Override
  public int number() {
    return number;
  }
}
