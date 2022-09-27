package com.mock.demo.model;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Summary {
    private ProjectSummary projectSummary;
    private CountMoveMethods countMoveMethods;
    private CountAWI countAWI;
    private MilestoneProgress milestoneProgress;
    private MilestoneStatus milestoneStatus;
}
