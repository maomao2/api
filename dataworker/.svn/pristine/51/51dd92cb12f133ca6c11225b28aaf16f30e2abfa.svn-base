package com.kwgproperty.server.dataworker;

import com.kwgproperty.server.dataworker.manager.MqttManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by jclang on 2017/5/20.
 */
@Component
public class StartupRunner implements CommandLineRunner {

    protected final static Logger logger = LoggerFactory.getLogger(StartupRunner.class);

    @Autowired
    private Environment env;

    @Override
    public void run(String... strings) throws Exception {
        // 程序启动时执行
        MqttManager.get();
    }

}
