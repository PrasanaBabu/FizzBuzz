package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void should_return_NumberAsString()
    {
        FizzBuzz fb = new FizzBuzz();
        String actual= fb.fizzbuzz(1);
        String expected="1";
        assertEquals(actual,expected);
    }
    @Test
    void should_return_MultiplesOfThree()
    {
        FizzBuzz fb = new FizzBuzz();
        String actual=fb.fizzbuzz(3);
        String expected="fizz";
        assertEquals(actual,expected);

    }

    @Test
    void should_return_BuzzForMultipleOfFive(){

        FizzBuzz fb = new FizzBuzz();

        String actual = fb.fizzbuzz(5);
        String expected = "buzz";

        assertEquals(expected, actual);
    }

    @Test
    void should_return_BuzzForMultipleOfThreeAndFive(){

        FizzBuzz fb = new FizzBuzz();

        String actual = fb.fizzbuzz(30);
        String expected = "fizzbuzz";

        assertEquals(expected, actual);
    }

    @Test
    void should_return_listOfStringTillLimit(){

        FizzBuzz fb = new FizzBuzz();

        List<String> actualStrings = fb.fizzbuzzTillLimit(15);
        List<String> expected = List.of( "1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz");

        assertEquals(expected, actualStrings);


    }




}