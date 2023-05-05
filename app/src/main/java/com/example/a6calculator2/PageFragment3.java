package com.example.a6calculator2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class PageFragment3 extends Fragment {
    public static PageFragment3 newInstance(int page){
        PageFragment3 fragment = new PageFragment3();
        return fragment;
    }
    public PageFragment3(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View result = inflater.inflate(R.layout.fragment_author_information, container, false);
        return result;
    }
}
