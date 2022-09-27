package com.mock.demo.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MilestoneProgress {

    private int scheduledTotalMilestones=200;
    private int scheduledNotStarted=10;
    private int scheduledOpen=110;
    private int scheduledInProgress=10;
    private int scheduledComplete=30;
    private int scheduledSkipped=40;

    private int completedNotStartedPercent=5;
    private int completedOpenPercent=55;
    private int completedInProgressPercent=5;
    private int completedCompletePercent=15;
    private int completedkippedPercent=20;



}
