package com.kosmos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestInfoLog extends Thread {
    //initialization of logger
    private static final Logger logger = LoggerFactory.getLogger(TestInfoLog.class);

    @Override
    public void run() {
        int res = 0;
        for (int i = 0; i < 10000000; i++){
            res = i * i;
        }
        System.out.println(res);
        logger.info("its ok");
    }
}
