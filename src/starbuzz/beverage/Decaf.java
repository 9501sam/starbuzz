package starbuzz.beverage;

import starbuzz.Beverage;

public class Decaf extends Beverage {
  public String getDescription() {
    return "Decaf Coffee";
  }

  public double cost() {
    return 1.05;
  }
}
