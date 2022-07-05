package Lesson3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Boolean1◦ Дано целое число A. Проверить истинность высказывания: «Число A является положительным».
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите число:  ");
        int a = in.nextInt();
        boolean res = a>0;
        System.out.println(res);

         */
       /* //Boolean2◦ Дано целое число A. Проверить истинность высказывания: «Число A является нечетным».
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:  ");
        int a = in.nextInt();
        boolean res = a % 2 != 0;
        System.out.println(res);

        */
       //Boolean3◦ Дано целое число A. Проверить истинность высказывания: «Число A является четным».
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите число:  ");
        int a = in.nextInt();
        boolean res = a % 2 == 0;
        System.out.println(res);
                 */
       /* //Boolean4◦ Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Справедливы неравенства A > 2 и B ≤ 3».
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        boolean res = a > 2 && b <= 3;
        System.out.print(res);

        */
       //Boolean5◦   Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Справедливы неравенства A ≥ 0 или B < −2».
       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        boolean res = a >= 0 || b <-2 ;
        System.out.print(res);
                    */
       // Boolean6◦. Даны три целых числа: A, B, C. Проверить истинность высказывания:
        // «Справедливо двойное неравенство A < B < C»
       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean res = a < b && b < c ;
        System.out.print(res);
            */
       //Boolean7◦Даны три целых числа: A, B, C. Проверить истинность высказывания:
       /* // «Число B находится между числами A и C». A<B<C, C<B<A  A<B&&B<C || C<B&&<A
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean res = a < b && b < c || c<b && b<a;
        System.out.print(res);
        */

       /*//Boolean8◦ Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Каждое из чисел A и B нечетное».
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        boolean res = a % 2 != 0 && b % 2 !=0;
        System.out.print(res);*/

       /* //Boolean9◦Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Хотя бы одно из чисел A и B нечетное».
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        boolean res = a % 2 != 0 || b % 2 !=0;
        System.out.print(res);
        */

       /*//Boolean10◦ Даны два целых числа: A, B. Проверить истинность высказывания: «Ровно одно из чисел A и B нечетное»
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        boolean res = (a % 2!=0 && b % 2==0) || (a % 2==0 && b % 2!=0); // a % 2 != 0 ^ b % 2 ! = 0
        System.out.print(res);
        */
       //Boolean11◦ Даны два целых числа: A, B. Проверить истинность высказывания:
        // «Числа A и B имеют одинаковую четность»
        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        boolean res = (a % 2!=0 && b % 2!=0) || (a % 2==0 && b % 2==0);//boolean res = (a%2)==(b%2)
        System.out.print(res);
        */

        /*//Boolean12◦ Даны три целых числа: A, B, C. Проверить истинность высказывания:
        // «Каждое из чисел A, B, C положительное».
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean res = a > 0 && b >0 && c>0;
        System.out.print(res);

         */

        /*//Boolean13◦
        //. Даны три целых числа: A, B, C. Проверить истинность высказывания:
        // «Хотя бы одно из чисел A, B, C положительное».
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean res = a > 0 || b >0 || c>0;
        System.out.print(res);
        */

       /* //Boolean14◦ Даны три целых числа: A, B, C. Проверить истинность высказывания:
        // «Ровно одно из чисел A, B, C положительное».
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean res = a > 0 ^ b >0 ^c>0; //(a >0 && b<0 && c<0) || (a>0 && b>0 && c<0)||(a<0 && b<0 && c>0);
        System.out.print(res);
                */

       //Boolean15◦ Даны три целых числа: A, B, C. Проверить истинность высказывания:
        // «Ровно два из чисел A, B, C являются положительными».
       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean res = (a >0 && b>0 && c<0) || (a<0 && b>0 && c>0)||(a>0 && b<0 && c>0);
        System.out.print(res);

        */
       /* //Boolean16◦. Дано целое положительное число.
        // Проверить истинность высказывания: «Данное число является четным двузначным».
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        // четное и двузначное
        boolean res =a % 2 ==0 && a>= 10 && a<100;
        System.out.print(res);
                */

      /* // Boolean18◦. Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара совпадающих».
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean res = (a==b) || (b==c) || (a==c);
        System.out.print(res);*/

       /* //Boolean19◦ Проверить истинность высказывания: «Среди трех данных целых
        // чисел есть хотя бы одна пара взаимно противоположных».
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean res = (a== -b) || (b==-c) || (-a==c);
        System.out.print(res);*/


      /* //Boolean20◦ Дано трехзначное число. Проверить истинность высказывания:
        //«Все цифры данного числа различны».
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sotni = a/100;
        int dec = (a/10) %10;  //a%100/10;
        int ed = a%10;
        boolean res = (sotni != dec) && (dec !=ed) && (sotni != ed);
        System.out.print(res);*/





















    }
}
