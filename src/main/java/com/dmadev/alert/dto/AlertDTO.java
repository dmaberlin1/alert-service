package com.dmadev.alert.dto;

import com.dmadev.alert.api.constant.AlertLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlertDTO {
    private AlertLevel alertLevel;
    private  double value;
    private LocalDateTime timestamp;
}
