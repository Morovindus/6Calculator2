package com.example.a6calculator2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter {
    public MyAdapter(FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return (PageFragment.newInstance(position));
        } if (position == 1){
            return (PageFragment2.newInstance(position));
        } if (position == 2){
            return (PageFragment3.newInstance(position));
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
