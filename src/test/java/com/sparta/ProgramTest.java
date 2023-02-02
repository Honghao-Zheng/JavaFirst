package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramTest {
//    @Test
//    @DisplayName("given a time of 21, greeting return good evening")
//    public void given21_greeting_returnGoodEvening(){
//        int time=21;
//        String expectedGreeting="Good evening";
//        String result=Program.greeting(time);
//        Assertions.assertEquals(expectedGreeting,result);
//    }
//    @Test
//    @DisplayName("given a time of 12, greeting return good morning")
//    public void given12_greeting_returnGoodEvening(){
//        int time=12;
//        String expectedGreeting="Good morning";
//        String result=Program.greeting(time);
//        Assertions.assertEquals(expectedGreeting,result);
//    }
    @ParameterizedTest
    @ValueSource(ints={5,8,12})
    @DisplayName("Given a time between 5 and 12. greeting return good morning ")
    public void GivenTimeBetween5And12_Greeting_ReturnGoodMorning(int time){
        String expected="Good morning";
        String result=Program.greeting(time);
        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest
    @ValueSource(ints={13,15,18})
    @DisplayName("Given a time between 13 and 18. greeting return good afternoon ")
    public void GivenTimeBetween13And18_Greeting_ReturnGoodAfternoon(int time){
        String expected="Good afternoon";
        String result=Program.greeting(time);
        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest
    @ValueSource(ints={19,23,24})
    @DisplayName("Given a time between 19 and 24. greeting return good evening ")
    public void GivenTimeBetween19And24_Greeting_ReturnGoodEvening(int time){
        String expected="Good evening";
        String result=Program.greeting(time);
        Assertions.assertEquals(expected,result);
    }
    @ParameterizedTest
    @ValueSource(ints={-1,3,44})
    @DisplayName("Given out of range time, greeting return unrecognised time")
    public void GivenTimeOutOfRange(int time){
        String expected="unrecognised time";
        String result=Program.greeting(time);
        Assertions.assertEquals(expected,result);
    }
}
