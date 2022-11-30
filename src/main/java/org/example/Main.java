package org.example;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
            try {
                int input = sc.nextInt();
                if(input<0)
                    throw new NegativeNumberException("Please give Positive numbers");
                FizzBuzz fb = new FizzBuzz();

                String output = fb.fizzbuzz(input);
                System.out.println("output = " + output);

                System.out.println("Enter limit");
                int limit = sc.nextInt();

                List<String> outputStrings = fb.fizzbuzzTillLimit(limit);

                System.out.println("outputStrings = " + outputStrings);

            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Input Mismatch. Please enter only integer" );
            }
    }
}