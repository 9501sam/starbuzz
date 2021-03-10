package starbuzz;

import java.util.Scanner;

public class StarbuzzCoffee {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    Beverage beverage;
    System.out.println("Choose a beverage: ");
    System.out.println("[1]House Blend");
    System.out.println("[2]Dark Roast");
    System.out.println("[3]Decaf");
    System.out.println("[4]Espresso");
    System.out.print(":");

    char input = sc.next().charAt(0);
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
  }
}
