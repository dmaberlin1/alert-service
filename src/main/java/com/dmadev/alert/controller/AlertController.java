package com.dmadev.alert.controller;

import com.dmadev.alert.entity.Alert;
import com.dmadev.alert.service.AlertService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alerts")
@RequiredArgsConstructor
public class AlertController {

    private final AlertService alertService;
    private static final Logger logger = LoggerFactory.getLogger(AlertController.class);

    @PostMapping
    public void receiveAlert(@RequestBody Alert alert){
        logger.info("Received alert: {}", alert);

        alertService.logAndSaveAlert(alert);
    }
}
