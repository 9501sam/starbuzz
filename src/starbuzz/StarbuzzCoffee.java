package starbuzz;

import java.util.Scanner;

public class StarbuzzCoffee {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char input;

    Beverage beverage = new HouseBlend();
    System.out.println("Choose a beverage: ");
    System.out.println("[1]House Blend");
    System.out.println("[2]Dark Roast");
    System.out.println("[3]Decaf");
    System.out.println("[4]Espresso");
    System.out.print(":");

    input = sc.next().charAt(0);
    switch (input) {
      case '1':
        beverage = new HouseBlend();
        break;
      case '2':
        beverage = new DarkRoast();
        break;
      case '3':
        beverage = new Decaf();
        break;
      case '4':
        beverage = new Espresso();
        break;
    }

    while (input != 'p') {
      System.out.println("Choose a Condiments or [p] to pay the check: ");
      System.out.println("[1]Milk");
      System.out.println("[2]Mocha");
      System.out.println("[3]Soy");
      System.out.println("[4]Whip");
      System.out.print(":");

      input = sc.next().charAt(0);
      switch (input) {
        case '1':
          beverage = new Milk(beverage);
          break;
        case '2':
          beverage = new Mocha(beverage);
          break;
        case '3':
          beverage = new Soy(beverage);
          break;
        case '4':
          beverage = new Whip(beverage);
          break;
      }
    }

    System.out.println(beverage.getDescription() 
        + " $" + beverage.cost());
  }
}
