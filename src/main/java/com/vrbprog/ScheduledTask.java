package com.vrbprog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

    @Autowired
    private TimePrinter timePrinter;

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        timePrinter.printCurrentTime();
    }
}