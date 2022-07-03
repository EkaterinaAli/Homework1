package homework1; // Алисионок Екатерина

import javax.lang.model.util.SimpleElementVisitor14;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class start {

    public static void main(String[] args) {
  /* //Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
    //Найти площади этих кругов S1 и S2, а также площадь S3 кольца, внешний радиус которого равен R1, а внутренний радиус равен R2: S1 = π·(R1)2 S2 = π·(R2)2
    //, S3 = S1 − S2.

    int R1 = 20;
    int R2 = 10;
    final double pi = 3.14;
    double S1 = pi * R1*R1;
    double S2 = pi * R2*R2;
    double S3 = S1-S2;
       System.out.println("Площадь круга S1: " + S1+ " Площадь кргуа S2: " + S2 + " Площадь кольца S3: " +S3);
     */

     /* //Begin16◦ Найти расстояние между двумя точками с заданными координатами x1 и x2 на числовой оси: |x2 − x1|.
      double x1 = 3;
      double x2 = 1.5;
      double Rast = Math.abs(x2-x1);
      System.out.println("Расстояние между двумя точками " +Rast);*/


       /*  //Begin19◦ Даны координаты двух противоположных вершин прямоугольника:
        //(x1, y1), (x2, y2). Стороны прямоугольника параллельны осям координат.
        //Найти периметр и площадь данного прямоугольника.
        double x1 = -3;
        double y1 = 1.5;
        double x2 = 4;
        double y2 = 3;
        double P = Math.abs(((x1-x2)+(y1-y2))*2);
        double S = Math.abs((x1-x2)*(y1-y2));
        System.out.println("Периметр прямоугольника равен " +P+ " Площадь прямоугольника равна " + S);*/


       /* //Begin20◦ Найти расстояние между двумя точками с заданными координатами
        //(x1, y1) и (x2, y2) на плоскости. Расстояние вычисляется по формуле q (x2 − x1) 2 + (y2 − y1)2
        double x1 =-1;
        double y1 = -1;
        double x2 = 1;
        double y2 = 1;
        double Rasst = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("Расстояние равно " +Rasst);
                */

       /* //Даны координаты трех вершин треугольника: (x1, y1), (x2, y2), (x3, y3).
        //Найти его периметр и площадь, используя формулу для расстояния между двумя точками на плоскости (см. задание Begin20). Для нахождения
        //площади треугольника со сторонами a, b, c использовать формулу Герона:
        //S =√p·(p − a)·(p − b)·(p − c), где p = (a + b + c)/2 — полупериметр.
        double x1 =-1;
        double y1 =-1;
        double x2 = 1;
        double y2 = 1;
        double x3 = 2;
        double y3 = 3;
        double a = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        double b = Math.sqrt(((x2-x3)*(x2-x3))+((y2-y3)*(y2-y3)));
        double c = Math.sqrt(((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1)));
        double P = a+b+c;
        double pp = (a+b+c)/2;
        double S = Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));

        System.out.println("Периметр треугольника " + P + "Площадь треуогльника " + S);

        */


    }

}
