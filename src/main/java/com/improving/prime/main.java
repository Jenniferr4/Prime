package com.improving.prime;

import java.math.BigInteger;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        boolean loop = true;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input a number between 1 to one million.. \n>");
            int input = scanner.nextInt();
            scanner.nextLine();
            System.out.println(new BigInteger(String.valueOf(input)).isProbablePrime(100));
//            System.out.println(isPrime(input));
        }
    }


        private static boolean isPrime(int input) {
        for(int i=2; i<Math.sqrt(input) ; i++) {
            if ((input % i)==0)
                return false;
        }
        return true;
        }


}