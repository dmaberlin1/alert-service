package com.dmadev.alert.entity;

import com.dmadev.alert.api.constant.AlertLevel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "alerts")
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    private AlertLevel alertLevel;
    private String alertLevel;

    private double value;

    private LocalDateTime timestamp;

    public Alert(AlertLevel alertLevel, double value, LocalDateTime timestamp) {
        this.alertLevel = alertLevel.getText();
        this.value = value;
        this.timestamp = timestamp;
    }

    public AlertLevel getAlertLevelEnum() {
        return AlertLevel.fromText(this.alertLevel);
    }

}
