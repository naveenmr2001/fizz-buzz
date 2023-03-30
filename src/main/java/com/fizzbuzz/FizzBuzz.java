package com.fizzbuzz;

public class FizzBuzz {

    private String[] fizzBuzzSequence;

    public FizzBuzz(int lengthOfFizzBuzz){

        for(int iterator=1;iterator<=lengthOfFizzBuzz;iterator++){
            //to check for FizzBuzz
            if(iterator%3 == 0 && iterator%5 == 0){
                fizzBuzzSequence[iterator] = "FizzBuzz";
            }else if(iterator%3 == 0){
                fizzBuzzSequence[iterator] = "Fizz";
            }else if(iterator%5 == 0){
                fizzBuzzSequence[iterator] = "Buzz";
            }else{
                fizzBuzzSequence[iterator] = Integer.toString(iterator);
            }
        }

    }

}
