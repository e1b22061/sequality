package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (x + y) / 2.0;
  }

  public double averageBetween(int x, int y) {
    if (x > y) {
      int temp = x;
      x = y;
      y = temp;
    }
    int sum = 0;
    int count = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
      count++;
    }
    return count == 0 ? 0 : (double) sum / count;
  }

  public int sumBetween(int x, int y) {
    if (x > y) {
      int temp = x;
      x = y;
      y = temp;
    }
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public int sumOfOddBetween(int x, int y) {
    if (x > y) {
      int temp = x;
      x = y;
      y = temp;
    }
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }

  public int sumOfEvenBetween(int x, int y) {
    if (x > y) {
      int temp = x;
      x = y;
      y = temp;
    }
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
