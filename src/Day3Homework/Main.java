package Day3Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Calculator calc = new Calculator();
        System.out.println("Kalkulator");


        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe nr 1: ");
        double nr1 = in.nextDouble();
        System.out.println("Podaj liczbe nr 2: ");
        double nr2 = in.nextDouble();
        System.out.println("Dodawanie, wybirz: 1");
        System.out.println("Odejmowanie, wybierz: 2");
        System.out.println("Mnożenie, wybierz: 3");
        System.out.println("Dzielenie, wybierz: 4");
        System.out.println("Poteguj, wybierz: 5");
        int choice = in.nextInt();
        System.out.println(choice);
        switch (choice) {
            case 1: {
                System.out.println(Calculator.add(nr1, nr2));
                break;
            }
            case 2: {
                System.out.println(Calculator.sub(nr1, nr2));
                break;
            }
            case 3: {
                System.out.println(Calculator.mult(nr1, nr2));
                break;
            }
            case 4: {
                System.out.println(Calculator.div(nr1, nr2));
                break;
            }
            case 5: {
                System.out.println(Calculator.pow2(nr1, nr2));
                break;
            }
            default: {
                System.out.println("Zly wybór");
                break;
            }
        }
    }
}

