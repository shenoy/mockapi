package com.mock.demo.model;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProjectSummary {
    private LocalDate[] dateRange = {LocalDate.now(), LocalDate.now().plusDays(2)};
    private Long countMoveEvents= 15l;
    private long countFreezeEvents=2l;
    private long countContingencyEvents = 2l;
}
