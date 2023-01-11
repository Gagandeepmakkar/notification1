package com.fhd.springbootpushnotification.SpringBootPushNotification;

import com.fhd.springbootpushnotification.SpringBootPushNotification.controller.PushNotificationController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;


@Component
public class ScheduledTasks {

    @Autowired
    PushNotificationController pushNotificationController;

    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");


    @Scheduled(cron = "0 0/2 * * * ?")
    public void scheduleTaskWithCronExpression() {
        pushNotificationController.sendAutomaticNotification();
        logger.info("Cron Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
    }

}
