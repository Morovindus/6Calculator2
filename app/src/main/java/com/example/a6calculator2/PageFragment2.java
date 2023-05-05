package com.example.a6calculator2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class PageFragment2 extends Fragment {
    public static PageFragment2 newInstance(int page){
        PageFragment2 fragment = new PageFragment2();
        return fragment;
    }
    public PageFragment2(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View result = inflater.inflate(R.layout.fragment_reference_information, container, false);
        return result;
    }
}
