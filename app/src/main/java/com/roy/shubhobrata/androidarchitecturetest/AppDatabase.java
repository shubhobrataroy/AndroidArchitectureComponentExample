package com.roy.shubhobrata.androidarchitecturetest;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by mobioapp on 2/13/2018.
 */

@Database(entities = {Alarms.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public abstract AlarmsDao alarmsDao();

    public static AppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "user-database")
                            .allowMainThreadQueries()
                            .build();
        }
        return INSTANCE;
    }

    public boolean hasConflict(Alarms alarms)
    {
        if (alarmsDao().conflictSelector(alarms.getHour(),alarms.getMinutes()).size()>0) return true;

        else return false;
    }

    public boolean checkedInsert (Alarms alarms)
    {
        if (hasConflict(alarms)) return false;

        else {
            alarmsDao().insertAll(alarms);
            return true;
        }
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
