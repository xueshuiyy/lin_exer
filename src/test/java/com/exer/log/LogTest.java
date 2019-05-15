package com.exer.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * Created by Administrator on 2019/4/11.
 */
public class LogTest {
    private static Log logger = LogFactory.getLog(LogTest.class);

    @Test
    public void test() {
        if (logger.isTraceEnabled()) {
            logger.trace("commons-logging-jcl trace message");
        }
        if (logger.isDebugEnabled()) {
            logger.debug("commons-logging-jcl debug message");
        }
        if (logger.isInfoEnabled()) {
            logger.info("commons-logging-jcl info message");
        }
    }
}
