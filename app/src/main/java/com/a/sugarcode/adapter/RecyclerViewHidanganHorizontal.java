package com.a.sugarcode.adapter;

import android.content.Context;

import com.a.sugarcode.model.Hidangan;

import java.util.List;

public class RecyclerViewHidanganHorizontal extends RecyclerView.Adapter<RecyclerViewHidanganHorizontal.ViewHolder> {
    private Context context;
    private List<Hidangan> hidangans;

    public RecyclerViewHidanganHorizontal(Context context, List<Hidangan> hidangans) {
        this.context = context;
        this.hidangans = hidangans;
    }

