package com.push.notificationmaker.Model;


import java.util.Calendar;

/**
 * Created by Akari Kato on 2017/10/21.
 */

public class Notification {

    String title;
    String body;
    boolean isOn;
    Calendar time;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }
}
