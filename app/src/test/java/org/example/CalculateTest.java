package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2, 3), 0.0001);
  }

  @Test
  public void testAverageBetween() {
    Calculate calculate = new Calculate();
    double expected = 5.5; // Average of numbers from 1 to 10
    assertEquals(expected, calculate.averageBetween(1, 10), 0.0001);
  }

  @Test
  public void testAverageBetweenReversed() {
    Calculate calculate = new Calculate();
    double expected = 5.5; // Average of numbers from 10 to 1
    assertEquals(expected, calculate.averageBetween(10, 1), 0.0001);
  }

  @Test
  public void testSumBetween() {
    Calculate calculate = new Calculate();
    int expected = 55; // Sum of numbers from 1 to 10
    assertEquals(expected, calculate.sumBetween(1, 10));
  }

  @Test
  public void testSumBetweenReversed() {
    Calculate calculate = new Calculate();
    int expected = 55; // Sum of numbers from 10 to 1
    assertEquals(expected, calculate.sumBetween(10, 1));
  }

  @Test
  public void testSumOfOddBetween() {
    Calculate calculate = new Calculate();
    int expected = 25; // Sum of odd numbers from 1 to 10
    assertEquals(expected, calculate.sumOfOddBetween(1, 10));
  }

  @Test
  public void testSumOfOddBetweenReversed() {
    Calculate calculate = new Calculate();
    int expected = 25; // Sum of odd numbers from 10 to 1
    assertEquals(expected, calculate.sumOfOddBetween(10, 1));
  }

  @Test
  public void testSumOfEvenBetween() {
    Calculate calculate = new Calculate();
    int expected = 30; // Sum of even numbers from 1 to 10
    assertEquals(expected, calculate.sumOfEvenBetween(1, 10));
  }

  @Test
  public void testSumOfEvenBetweenReversed() {
    Calculate calculate = new Calculate();
    int expected = 30; // Sum of even numbers from 10 to 1
    assertEquals(expected, calculate.sumOfEvenBetween(10, 1));
  }
}
