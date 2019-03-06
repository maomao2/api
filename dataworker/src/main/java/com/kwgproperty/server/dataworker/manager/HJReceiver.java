package com.kwgproperty.server.dataworker.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jclang on 2017/9/18.
 */
public class HJReceiver {

    protected final static Logger logger = LoggerFactory.getLogger(HJReceiver.class);

    @Autowired
    public HJReceiver() {
    }

    public void receiveMessage(String message) {
        logger.error("Received key expire event:" + message);
    }

}
