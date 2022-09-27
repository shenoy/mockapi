package com.mock.demo.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountAWI {
    private int scheduledVirtualServer = 4;
    private int scheduledPhysicalServer = 112;
    private int scheduledWeb = 31;
    private int scheduledDatabase = 48;
    private int scheduledFileshare = 65;
    private int scheduledStorageLUN = 76;

    private int completedVirtualServerPercent =10;
    private int completedPhysicalServerPercent = 42;
    private int completedWebPercent=12;
    private int completedDatabasePercent=32;
    private int completedFilesharePercent=30;
    private int completedStorageLUNPercent=21;

}
