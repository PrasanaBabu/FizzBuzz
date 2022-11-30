package org.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public String fizzbuzz(int number) throws NumberFormatException{

            if (number % 3 == 0 && number % 5 == 0) {
                return "fizzbuzz";
            }
            if (number % 3 == 0) {
                return "fizz";
            }
            if (number % 5 == 0) {
                return "buzz";
            }


        return Integer.toString(number);

    }

    public List<String> fizzbuzzTillLimit(int limit){

        List<String> strings = new ArrayList<>();

        for(int i=1; i<=limit; i++) {
            strings.add(this.fizzbuzz(i));
        }

        return strings;
    }

}
