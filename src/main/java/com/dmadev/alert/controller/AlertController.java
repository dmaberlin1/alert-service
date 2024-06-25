package com.dmadev.alert.controller;

import com.dmadev.alert.service.AlertService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alerts")
@RequiredArgsConstructor
public class AlertController {
    private final AlertService alertService;

    @PostMapping
    public void receiveAlert(@RequestBody String message){
        alertService.logAndSaveAlert(message);
    }
}
