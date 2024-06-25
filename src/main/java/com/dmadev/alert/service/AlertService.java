package com.dmadev.alert.service;


import com.dmadev.alert.entity.Alert;
import com.dmadev.alert.repository.AlertRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AlertService {
    private static final Logger logger = LoggerFactory.getLogger(AlertService.class);
    private final AlertRepository alertRepository;

    public void logAndSaveAlert(Alert alertDTO) {
        logger.info("Received alert: {}", alertDTO);

        Alert alert = new Alert(alertDTO.getAlertLevel(), alertDTO.getValue(), alertDTO.getTimestamp());

        alertRepository.save(alert);
    }
}
