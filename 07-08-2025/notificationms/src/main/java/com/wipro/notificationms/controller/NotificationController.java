package com.wipro.notificationms.controller;

import com.wipro.notificationms.dto.NotificationDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {

    @PostMapping("/notify")
    public String notifyAction(@RequestBody NotificationDTO notificationDTO) {
        String username = notificationDTO.getUser().getUserName();
        String action = notificationDTO.getAction();
        return "User " + username + " is " + action;
    }
}
