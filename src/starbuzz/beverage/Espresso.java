package starbuzz.beverage;

import starbuzz.Beverage;

public class Espresso extends Beverage {
  public String getDescription() {
    return "Espresso";
  }

  public double cost() {
    return 1.99;
  }
}
