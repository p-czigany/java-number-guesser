package org.example;

public final class VerbalizedDifference implements Difference {
  private final Difference difference;

  public VerbalizedDifference(Difference difference) {
    this.difference = difference;
  }

  @Override
  public int number() {
    int diffNumber = this.difference.number();
    if (diffNumber > 0) {
      System.out.println("Too large.");
    } else if (diffNumber < 0) {
      System.out.println("Too small.");
    } else {
      System.out.println("That's it!!");
    }
    return diffNumber;
  }
}
