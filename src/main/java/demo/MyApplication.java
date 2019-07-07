package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 * @date 2019/7/6/006 19:11
 * @Version 1.0
 */
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(MyApplication.class);
        try {
            SpringApplication.run(MyApplication.class);
            logger.info("springBoot启动成功...");
        } catch (Exception e) {
            logger.info("SpringBoot启动失败...");
        }
    }
}
