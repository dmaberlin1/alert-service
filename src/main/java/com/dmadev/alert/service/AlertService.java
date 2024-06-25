package com.dmadev.alert.service;

import com.dmadev.alert.entity.Alert;
import com.dmadev.alert.repository.AlertRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AlertService {
    private static final Logger logger= LoggerFactory.getLogger(AlertService.class);
    private final AlertRepository alertRepository;

    public void logAndSaveAlert(String message){
        LocalDateTime timestamp=LocalDateTime.now();
        Alert alert=new Alert(message,timestamp);
        logger.info("Received alert: {}",message);
        alertRepository.save(alert);
    }
}
