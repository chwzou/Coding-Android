package net.coding.program.common.widget;

import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by chenchao on 15/5/29.
 */
public abstract class DataAdapter<T> extends BaseAdapter {

    private ArrayList<T> mData;

    public DataAdapter(ArrayList<T> mData) {
        this.mData = mData;
    }

    public DataAdapter() {
        mData = new ArrayList<T>();
    }

    public void appendData(ArrayList<T> data) {
        mData.addAll(data);
        notifyDataSetChanged();
    }

    public void removeDataUpdate(T item) {
        mData.remove(item);
        notifyDataSetChanged();
    }

    public void appendData(T data) {
        mData.add(data);
    }

    public void resetData(ArrayList<T> data) {
        mData = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}