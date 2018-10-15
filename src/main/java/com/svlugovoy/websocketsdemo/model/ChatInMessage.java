package com.svlugovoy.websocketsdemo.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatInMessage {

    private String senderId;
    private String senderName;
    private String message;
    private Date sentTimestamp;

    public ChatInMessage(String message) {
        this.message = message;
    }
}
