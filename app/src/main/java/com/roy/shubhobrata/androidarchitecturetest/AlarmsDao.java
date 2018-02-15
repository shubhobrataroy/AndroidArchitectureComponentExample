package com.roy.shubhobrata.androidarchitecturetest;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import java.util.List;

/**
 * Created by mobioapp on 2/13/2018.
 */

@Dao
public interface AlarmsDao {
    @Query("SELECT * FROM alarms")
    LiveData <List<Alarms>> getAll();

    @Query("SELECT * FROM alarms WHERE id IN (:ids)")
    List<Alarms> loadAllByIds(int[] ids);

    @Query("SELECT id FROM alarms WHERE hour = (:hour) and minutes = (:minutes)")
    List<Integer> conflictSelector(int hour , int minutes);

    @Insert
    void insertAll(Alarms... alarms);

    @Delete
    void delete(Alarms alarms);

    @Update
    void update(Alarms alarms);

    @Query("SELECT COUNT(*) FROM alarms")
    int itemCount ();
}
