package com.roy.shubhobrata.androidarchitecturetest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private List<Alarms> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView time, volume, repeat;

        public MyViewHolder(View view) {
            super(view);
            time = (TextView) view.findViewById(R.id.time_item);
            volume = (TextView) view.findViewById(R.id.volume_item);
            repeat = (TextView) view.findViewById(R.id.repeat_schedule_item);
        }
    }


    public MoviesAdapter(List<Alarms> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Alarms alarms = moviesList.get(position);
        holder.time.setText(alarms.getHour()+":"+alarms.getMinutes());
        holder.volume.setText(alarms.getVolume());
        holder.repeat.setText(alarms.getProfile());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
