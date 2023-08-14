// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.*;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
//      String name  = "Vanshu";
//      String neighbour = "Akku";
//      int age = 21;
//
//      String friend = neighbour;
//
//        int a;
//        do{
//            System.out.println("Enter a number");
//            Scanner sc = new Scanner(System.in);
//            a = sc.nextInt();
//
//            System.out.println(a);
//
//
//        }while (a>=0);
//
//        System.out.println("Dhickauuu");


        Random random = new Random();

        int min = 10;
        int max = 90;

        int randomNumber = random.nextInt(max - min + 1) + min;

        //System.out.println("The random number is: " + randomNumber);


        Scanner sc = new Scanner((System.in));

//    int random = (int) (Math.random()*100);
////    int random = 50;
        int num;

        System.out.println("System has generated some random number, You have to GUESS the generated number to WIN");
        System.out.println("Enter -1 to quit and know the Random Number");

        do {
            System.out.print("Enter a Number : ");
            num = sc.nextInt();
//            close = IntStream
//            if (num in range((random-10), random+10)){
//                System.out.println("You are close!!!");

            if (num < 0) {
                System.out.println("Exited");
                System.out.println("Number was " + random);
                break;
            } else if ((num >= (randomNumber - 10)) && (num <= (randomNumber + 10)) && num != randomNumber) {
                System.out.println("Your are close!!!");


            } else if (num < randomNumber) {
                System.out.println("Your Guess was too low");

            } else if (num > randomNumber) {
                System.out.println("Your guess was too high");
            } else {
                System.out.println("Yay!!! you guessed the correct number " + num);
                break;
            }

        } while (num > 0);

    }
}



