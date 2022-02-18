package service;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTurnTest {


    @RepeatedTest(100)
    void getComputerScore(){
        int result = new ComputerTurn().getComputerScore();
        System.out.println(result);
        assertTrue(result >= 0);
        assertTrue(result <= 2);
    }


}