package com.alexander.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isPlaying = true;

        do {
            int result = scannerNumber();

            if (result > 1000) {
                isPlaying = false;
                break;
            }

            for (int i = 0; i < result; i++) {
                System.out.println(i);
                System.out.println("Looping...");
            }


        } while (isPlaying);

    }

        /*
        Scanner scan = new Scanner(System.in);

        // Input Sequence //

        System.out.println("Please insert a random sentence");
        scan.nextLine();

        System.out.println("This is unrelated");
        scan.nextLine();
        */

    public static int scannerNumber() {
        Scanner sc = new Scanner((System.in));

        System.out.println("Please insert a number");
        return sc.nextInt();





    }
    public static String scannerText() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert some sentence");
        String input = sc.nextLine();




        return input;
    }

}
