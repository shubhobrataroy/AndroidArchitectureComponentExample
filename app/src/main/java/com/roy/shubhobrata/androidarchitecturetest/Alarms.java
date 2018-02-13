package com.roy.shubhobrata.androidarchitecturetest;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by mobioapp on 2/13/2018.
 */

@Entity
public class Alarms {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "hour")
    private int hour;

    @ColumnInfo(name = "minutes")
    private int minutes;

    @ColumnInfo(name = "profile")
    private String profile;

    @ColumnInfo(name = "state")
    private Boolean state;

    @ColumnInfo(name = "volume")
    private int volume;

    @ColumnInfo(name = "timeout_id")
    private int timeout_id;

    @ColumnInfo(name = "timeout_hour")
    private int timeout_hour;

    @ColumnInfo(name = "timeout_minutes")
    private int timeout_minutes;

    @ColumnInfo(name = "timeout_profile")
    private String timeout_profile;

    @ColumnInfo(name = "timeout_volume")
    private int timeout_volume;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTimeout_id() {
        return timeout_id;
    }

    public void setTimeout_id(int timeout_id) {
        this.timeout_id = timeout_id;
    }

    public int getTimeout_hour() {
        return timeout_hour;
    }

    public void setTimeout_hour(int timeout_hour) {
        this.timeout_hour = timeout_hour;
    }

    public int getTimeout_minutes() {
        return timeout_minutes;
    }

    public void setTimeout_minutes(int timeout_minutes) {
        this.timeout_minutes = timeout_minutes;
    }

    public String getTimeout_profile() {
        return timeout_profile;
    }

    public void setTimeout_profile(String timeout_profile) {
        this.timeout_profile = timeout_profile;
    }

    public int getTimeout_volume() {
        return timeout_volume;
    }

    public void setTimeout_volume(int timeout_volume) {
        this.timeout_volume = timeout_volume;
    }

    public Alarms( int hour, int minutes, String profile, Boolean state, int volume, int timeout_id, int timeout_hour, int timeout_minutes, String timeout_profile, int timeout_volume) {
        this.hour = hour;
        this.minutes = minutes;
        this.profile = profile;
        this.state = state;
        this.volume = volume;
        this.timeout_id = timeout_id;
        this.timeout_hour = timeout_hour;
        this.timeout_minutes = timeout_minutes;
        this.timeout_profile = timeout_profile;
        this.timeout_volume = timeout_volume;
    }
}
