package com.chenhong.android.carsdoor.adapter;

import android.view.View;

import java.util.List;

/**
 * 抽象的PagerAdapter实现类,封装了内容为View,数据为List类型的适配器实现.
 */
public abstract class AbstractPagerListAdapter<T> extends AbstractViewPagerAdapter {

    protected List<T> mData;

    public AbstractPagerListAdapter(List<T> data) {
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    public abstract View newView(int position);

    public T getItem(int position) {
        return mData.get(position);
    }
}
