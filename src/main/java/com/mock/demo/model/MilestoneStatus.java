package com.mock.demo.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MilestoneStatus {
    private int completed =10;
    private int moreThan7DaysLeft=20;
    private int lessThan7DaysLeft=10;
    private int overdue=5;
}
