package com.svlugovoy.websocketsdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatOutMessage {

    private String content;
    private String groupName;
    private Date sentTimestamp;

    public ChatOutMessage(String content) {
        this.content = content;
    }
}
