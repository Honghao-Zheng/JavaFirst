package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramTest {
    @Test
    @DisplayName("given a time of 21, greeting return good evening")
    public void given21_greeting_returnGoodEvening(){
        int time=21;
        String expectedGreeting="Good evening";
        String result=Program.greeting(time);
        Assertions.assertEquals(expectedGreeting,result);


    }
    @Test
    @DisplayName("given a time of 12, greeting return good morning")
    public void given12_greeting_returnGoodEvening(){
        int time=12;
        String expectedGreeting="Good morning";
        String result=Program.greeting(time);
        Assertions.assertEquals(expectedGreeting,result);
    }
    @ParameterizedTest
    @ValueSource(ints={5,8,12})
    @DisplayName("Given a time between 5 and 12. greeting return good morning ")
    public void GivenTimeBetween5And12_Greeting_ReturnGoodMorning(int time){
        String expected="Good morning";
        String result=Program.greeting(time);
        Assertions.assertEquals(expected,result);
    }

}
