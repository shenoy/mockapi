package com.mock.demo.controllers;


import com.mock.demo.model.Summary;
import com.mock.demo.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExecSummaryController {

    @Autowired
    SummaryService summaryService;

    @GetMapping("/")
    public ResponseEntity<Summary> getSummary(){
        Summary summary =  summaryService.getSummary();
        return new ResponseEntity<>(summary, HttpStatus.OK);
    }
}
