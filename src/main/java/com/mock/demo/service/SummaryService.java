package com.mock.demo.service;

import com.mock.demo.model.*;
import org.springframework.stereotype.Service;

@Service
public class SummaryService {

    public Summary getSummary(){
        return new Summary(new ProjectSummary(),
                new CountMoveMethods(),
                new CountAWI(),
                new MilestoneProgress(),
                new MilestoneStatus()
                );
    }

}
