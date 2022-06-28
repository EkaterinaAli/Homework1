package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // Begin 1 Дана сторона квадрата а. Найти его периметр Р=4*а
     /*   int a = 5;
        // вычисление результат
        int P = 4 * a;
        //вывод результат
        System.out.println(P);
    */
       /* //Дана сторона квадрата а. Найдите его площадь S = a**2
    int a=6;
    int S =a*a;
    System.out.println("У квадрата со стороной " + a + " площадь "+ S);*/
/*
       // begin 4 Дан диаметр окружности d. Найти ее длину L=п*d. В качестве
        // значения использовать п использовать 3,14.
        int d = 18;
        final double pi = 3.14;
        double L = pi * d;
        System.out.println("У круга с диаметром " + d + " длина окружности " + L);
        */
      /*// begin 5 дана длина ребра куба а. Найти объем куба V=a^3  и площадь его
      // поверхности S = 6*a2
      int a = 5;
      int v = a*a*a;
      int S = a*a*6;

        System.out.println ("Объем куба:" + v);
        System.out.println( "Площадь поверхности куба: " +S );

       */
     /* //  begin 6 Дана длина ребра a, b, c прямоугольного параллелепипеда. Найти его
      //его объем V =a*b*c и площадь поверхности S = 2·(a·b + b·c + a·c).
        int a=2;
        int b=3;
        int c=4;
        int V=a*b*c;
        int S=2*(a*b+b*c+a*c);
        System.out.println(" V " + V);
        System.out.println(" S " + S);*/

     /*//Begin8 Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2.

        int a = 3;
        int b = 4;
        int d = 2;
        double c = (a+b)/(double)d;
        System.out.println("Срднее арифметическое: " + c);*/

      /*//Даны два неотрицательных числа a и b. Найти их среднее геометрическое, то есть квадратный корень из их произведения: √
        //a·b.
        double a =3.45;
        double b = 7.2;
        double g_avg = Math.sqrt(a*b);
        System.out.println("квадратный корень из их произведения " + g_avg);*/

      //  begin 10  Даны два ненулевых числа. Найти сумму, разность, произведение и
        //частное их квадратов.
           /*
        int a=25;
        int b=45;
        int s=(a*a)+(b*b);
        int d=(a*a)-(b*b);
        int r=(a*a)*(b*b);
        double f=(a*a)/(double)(b*b);
        System.out.println("Сумма: "+s);
        System.out.println("Разность: "+d);
        System.out.println("Произведение: "+r);
        System.out.println("Частное: "+f);*/

        /*  //Begin11◦
        //. Даны два ненулевых числа. Найти сумму, разность, произведение и
        //частное их модулей.
        int a=-5;
        int b=24;
        a = Math.abs(a);
        b = Math.abs(b);
        double s = a+b;
        System.out.println("Сумма модулей "+ (int) s);
        s= a-b;
        System.out.println(" Разность модулей "+ (int) s);
        s = a*b;
        System.out.println("Произведение модулей "+ (int) s);
        s = (double)a/b;
        System.out.println("Частное модулей "+ s);*/

     /* //  Begin22◦ Поменять местами содержимое переменных A и B и вывести новые
     //   значения A и B.
      int a = 3;
      int b = 10;
      int c = a;
       a = b;
       b = c;
        System.out.println("a =  " + a + " b = "+ b);*/

     /*// Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P:
        //c =√a2 + b2
        //, P = a + b + c.

        int a = 4;
        int b = 8;
        double c = Math.sqrt(a*a+b*b);
        double p = a+b+c;
        System.out.println("Гипотеза =  " + c + " периметр  "+ p); */

     //Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
        //Найти площади этих кругов S1 и S2, а также площадь S3 кольца, внешний радиус которого равен R1, а внутренний
        // радиус равен R2: S1 = π·(R1)2, S2 = π·(R2)2, S3 = S1 − S2.

        int R1 = 20;
        int R2 = 10;
        final double pi = 3.14;
        double S1 = pi * R1*R1;
        double S2 = pi * R2*R2;
        double S3 = S1-S2;
        System.out.println("площадь s1 =  " + s1 + " периметр  "+ p); */











    }
}
