package com.atguigu.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigAutoconfigApplicationTests {

    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        //日志级别
        //由低到高
        //可以调整输出的日志级别：日志就只会在这个级别以后的高级别生效
        logger.trace("这是trace日志");
        logger.debug("这是debug日志");
        //SpringBoot默认给我们使用的日志级别是info，没有指定级别的使用默认
        logger.info("这是info日志");
        logger.warn("这是warn日志");
        logger.error("这是error日志");
    }

}
