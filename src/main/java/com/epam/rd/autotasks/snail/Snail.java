package com.epam.rd.autotasks.snail;

import java.util.Scanner;
public class Snail
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        int day = 1;
        int highForDay = a;
//Проверка условия, достижения вершины за один день
        if (a >= h) {
            System.out.println(day);
//не должен быть прирост за день отрицательным или нуль
        } else if ((a - b) <= 0 && (a - b) * 2 < h) {
            System.out.println("Impossible");
        } else {
//Цикл для подсчета дней
            while (highForDay < h) {
                highForDay += (a - b);
                day++;
            }
            System.out.println(day);
        }
    }
}


