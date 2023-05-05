package com.example.a6calculator2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {

    public static PageFragment newInstance(int page){
        PageFragment fragment = new PageFragment();
        return fragment;
    }
    public PageFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View result = inflater.inflate(R.layout.fragment_main, container, false);
        return result;
    }
}
