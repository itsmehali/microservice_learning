package com.amigoscode.clients.fraud.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("notification")
public interface NotificationClient {
    @PostMapping(path = "api/v1/notification")
    void sendNotification(NotificationRequest notificationRequest);

}
