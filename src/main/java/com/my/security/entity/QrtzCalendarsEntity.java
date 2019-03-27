package com.my.security.entity;

public class QrtzCalendarsEntity extends QrtzCalendarsEntityKey {
    private byte[] calendar;

    public byte[] getCalendar() {
        return calendar;
    }

    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }
}