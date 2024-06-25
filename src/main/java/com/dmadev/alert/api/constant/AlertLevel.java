package com.dmadev.alert.api.constant;

import lombok.Getter;

@Getter
public enum AlertLevel {
    GREEN("GREEN"),
    YELLOW("YELLOW"),
    RED("RED"),
    BLACK("BLACK");


    private final String text;

    AlertLevel(String text) {
        this.text = text;
    }

    public static AlertLevel fromText(String text) {
        for (AlertLevel level : values()) {
            if (level.text.equalsIgnoreCase(text)) {
                return level;
            }
        }
        throw new IllegalArgumentException("Unknown AlertLevel text: " + text);
    }
}
