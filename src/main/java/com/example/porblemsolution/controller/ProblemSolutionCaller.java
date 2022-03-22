package com.example.porblemsolution.controller;

import com.example.porblemsolution.service.ProblemSolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProblemSolutionCaller {

    private ProblemSolutionService problemSolutionService;

    @Autowired
    public ProblemSolutionCaller(ProblemSolutionService problemSolutionService) {
        this.problemSolutionService = problemSolutionService;
    }

    @PostMapping("/problem/solve")
    public String callProblem(@RequestBody String numbersArray) {
        return this.problemSolutionService.solveProblem(numbersArray);
    }
}
