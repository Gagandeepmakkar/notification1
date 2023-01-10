package com.fhd.springbootpushnotification.SpringBootPushNotification.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class PushNotificationRequest {


	private String title;
    private String message;

    public void setTopic(String topic) {
        this.topic = topic;
    }

    private String topic;
    private String token;
    private List<String> tokens;

    public List<String> getTokens(){ return tokens; }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getTopic() {
        return topic;
    }

    public String getToken() {
        return token;
    }
}