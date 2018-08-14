package com.calculator;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double val1;
        System.out.println("Enter your first value here:");
        Scanner input = new Scanner(System.in);
        val1 = input.nextInt();
        double val2;
        System.out.println("Enter your Second value here:");
        Scanner input2 = new Scanner(System.in);
        val2 = input.nextInt();

        Scanner s = new Scanner(System.in);
        char give;
        System.out.println("Enter A for Addition \n Enter S for Substraction \n Enter D for Division \n Enter M  for Multiplication");
        give = s.next().charAt(0);

        if (give == 'A' | give == 'a') {
            System.out.println(val1 + val2);
        } else if (give == 'S' | give == 's') {
            System.out.print(val1 - val2);
        } else if (give == 'M' | give == 'm') {
            System.out.println(val1 * val2);
        } else if (give == 'D' | give == 'd') {
            System.out.println(val1 / val2);
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}