package com.company.franckPairProgramming;

public class FizzBuzz
{
    public String fizzBuzz(Integer i)
    {
        if (i % 3 == 0)
        {
            return "Fizz";
        }
        else if (i % 5 == 0)
        {
            return "Buzz";
        }
        else if (i % 3 == 0 && i % 5 == 0)
        {
            return "FizzBuzz";
        }
        else
        {
            return "It is neither " + i;
        }
    }
}
