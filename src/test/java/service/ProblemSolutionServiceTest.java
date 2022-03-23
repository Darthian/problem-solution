package service;

import com.example.porblemsolution.service.ProblemSolutionServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProblemSolutionServiceTest {

    private ProblemSolutionServiceImpl implementation;
    private String numbersArrayString;

    @BeforeEach
    public void setup() {
        implementation = new ProblemSolutionServiceImpl();
        numbersArrayString = "6, 4, 2, 10";
    }

    @Test
    public void testInput() {
        String result = this.implementation.solveProblem(numbersArrayString);
        Assertions.assertEquals("2 4\n4 6\n", result);
    }

    @Test
    public void testCases() {
        numbersArrayString = "4,4,-2,-1,3";
        String result = this.implementation.solveProblem(numbersArrayString);
        Assertions.assertEquals("-2 -1\n3 4\n", result);

        numbersArrayString = "5,-9,-5,9,10,12";
        result = this.implementation.solveProblem(numbersArrayString);
        Assertions.assertEquals("9 10\n", result);
    }
}
