package com.fizzbuzz;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {

    @Nested
    class FizzBuzzTestClass{
        FizzBuzz fizzBuzzObject = new FizzBuzz(15);

        @Test
        void toCheckANumberInAFizzBuzzSequenceForOne(){
            String expectedValue = "1";

            String actualValue = fizzBuzzObject.fizzBuzzEachNumberCheck(1);

            assertEquals(expectedValue,actualValue);
        }

        @Test
        void toCheckANumberInAFizzBuzzSequenceForThree(){

            String expectedValue = "Fizz";

            String actualValue = fizzBuzzObject.fizzBuzzEachNumberCheck(3);

            assertEquals(expectedValue,actualValue);
        }

        @Test
        void toCheckANumberInAFizzBuzzSequenceForFive(){

            String expectedValue = "Buzz";

            String actualValue = fizzBuzzObject.fizzBuzzEachNumberCheck(5);

            assertEquals(expectedValue,actualValue);

        }

        @Test
        void toCheckANumberInAFizzBuzzSequenceForFifteen(){

            String expectedValue = "FizzBuzz";

            String actualValue = fizzBuzzObject.fizzBuzzEachNumberCheck(15);

            assertEquals(expectedValue,actualValue);

        }

        void toCheckTheExceptionForGreaterThanInputInAFizzBuzzForSixteen(){

            assertThrows(IllegalArgumentException.class,()->fizzBuzzObject.fizzBuzzEachNumberCheck(16));

        }
    }

}
