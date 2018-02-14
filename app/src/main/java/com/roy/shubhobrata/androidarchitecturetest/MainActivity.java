package com.roy.shubhobrata.androidarchitecturetest;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase database = AppDatabase.getAppDatabase(this);
        database.alarmsDao().insertAll(new Alarms(12,12,"loud",false,9,0,12,13,"loud",9));
        List<Alarms> infos = database.alarmsDao().getAll();
    }

    int i=0;
    public void click(View view) {
        AppDatabase.getAppDatabase(this).checkedInsert(new Alarms(12+i,12,"loud",false,9,i++,12,13,"loud",9));
        List<Alarms> infos = AppDatabase.getAppDatabase(this).alarmsDao().getAll();
        ((TextView)findViewById(R.id.text)).setText(infos.get(infos.size()-1).getTimeout_id()+"   "+infos.size());
    }
}
