package starbuzz.beverage;

import starbuzz.Beverage;

public class HouseBlend extends Beverage {
  public String getDescription() {
    return "House Blend Coffee";
  }

  public double cost() {
    return 0.89;
  }
}
