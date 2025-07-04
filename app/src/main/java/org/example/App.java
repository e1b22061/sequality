/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    Calculate calculate = new Calculate();
    System.out.println(
        "Sum of 2 and 3 is %d. ".formatted(calculate.sum(2, 3))
            + "Average is %.1f.".formatted(calculate.average(2, 3)));
    System.out.println(
        "Sum of 1 to 10 is %d. ".formatted(calculate.sumBetween(1, 10))
            + "Average is %.1f.".formatted(calculate.averageBetween(1, 10)));
    System.out.println("Sum of odd of 1 to 10 is %d.".formatted(calculate.sumOfOddBetween(1, 10)));
    System.out.println("Sum of even of 1 to 10 is %d.".formatted(calculate.sumOfEvenBetween(1, 10)));
  }
}
