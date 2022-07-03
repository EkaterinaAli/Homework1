package homework2;
import java.util.Scanner;
public class start2 {
    public static void main(String[] args) {

     /*   // Integer15 Дано трехзначное число. Вывести число, полученное при перестановке цифр
        //   сотен и десятков исходного числа (например, 123 перейдет в 213).
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число:  ");
        int number = in.nextInt();
        int sot = (number/100);
        int dec = (number/10)%10;
        int ed = (number%10);
        int rez = (dec*100)+(sot*10)+ed;
        System.out.println("Полученное число " +rez);
              */

       // Integer16. Дано трехзначное число. Вывести число, полученное при перестановке цифр
        // десятков и единиц исходного числа (например, 123 перейдет в 132).
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число:  ");
        int number = in.nextInt();
        int sot = (number/100);
        int dec = (number/10)%10;
        int ed = (number%10);
        int rez = sot*100 + ed*10 + dec;
        System.out.println("Полученное число " +rez);

    }
}
