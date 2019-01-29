package com.javaedge.security.schedue;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created on 2017/11/23 0023.
 *
 * @author sss
 * @since 1.0
 */
@Component
@Slf4j
public class Task {

//    @Scheduled(cron = "* 0/1 * * * ? ")
    public void cron() throws Exception{
        log.info("定时任务执行中。。。。");
    }
}
