package com.vrbprog;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TimePrinter {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    public void printCurrentTime() {
        System.out.println("The time is now " + DATE_FORMAT.format(new Date()));
    }

}

