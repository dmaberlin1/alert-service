package com.dmadev.alert.entity;

import com.dmadev.alert.api.constant.AlertLevel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "alerts")
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private AlertLevel alertLevel;
    private double value;
    private LocalDateTime timestamp;

    public Alert(AlertLevel alertLevel, double value, LocalDateTime timestamp) {
        this.alertLevel = alertLevel;
        this.value = value;
        this.timestamp = timestamp;
    }
}
