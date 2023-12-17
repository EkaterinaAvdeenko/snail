package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int h = scan.nextInt();
    int day = 1;
    int highForDay = a;

    if (a >= h) {
      System.out.println(day);

    } else if ((a - b) <= 0 && (a - b) * 2 < h) {
      System.out.println("Impossible");
    } else {

      while (highForDay < h) {
        highForDay += (a - b);
        day++;
      }
      System.out.println(day);
    }
  }
}
