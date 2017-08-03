package com.example.mvpframe.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvpframe.R;

public class CenterActionFragment extends Fragment {

    public static final String TAG = "CenterActionFragment";

    private static CenterActionFragment fragment;

    public static CenterActionFragment newInstance() {
        if (null == fragment) {
            fragment = new CenterActionFragment();
        }
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_center_action, container, false);
        return view;
    }
}
