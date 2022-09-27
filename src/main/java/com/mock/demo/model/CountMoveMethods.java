package com.mock.demo.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountMoveMethods {

   private int scheduledCloneV2V= 123;
   private int completedConeV2Vpercent = 50;
    private int scheduledCloneV2C= 543;
    private int completedConeV2Cpercent = 34;
    private int scheduledLiftAndShift = 323;
    private int completedLiftAndShiftpercent=42;
    private int dataMigration=98;
    private int completedDataMigrationPercent = 15;
    private int scheduledRebuild = 87;
    private int scheduledRebuildAndMigration = 39;
    private int completedRebuildPercent = 13;
    private int completedRebuildAndMigrationPercent= 14;

}
