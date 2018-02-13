package com.roy.shubhobrata.androidarchitecturetest;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by mobioapp on 2/13/2018.
 */

@Dao
public interface AlarmsDao {
    @Query("SELECT * FROM alarms")
    List<Alarms> getAll();

    @Query("SELECT * FROM alarms WHERE id IN (:ids)")
    List<Alarms> loadAllByIds(int[] ids);



    @Insert
    void insertAll(Alarms... alarms);

    @Delete
    void delete(Alarms alarms);
}
