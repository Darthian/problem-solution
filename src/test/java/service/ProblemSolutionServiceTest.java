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
        Assertions.assertEquals("(2, 4)(4, 6)", result);
    }
}
