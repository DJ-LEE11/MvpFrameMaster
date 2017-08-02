package com.example.mvpframe.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvpframe.R;

/**
 * Created by Riven on 2016/12/22.
 * Email: 1819485687@qq.com
 */
public class PersonCenterFragment extends Fragment {

    public static final String TAG = "PersonCenterFragment";

    private static PersonCenterFragment fragment;
    public static PersonCenterFragment newInstance() {
        if(null ==  fragment){
            fragment = new PersonCenterFragment();
        }
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person_center, container, false);
        return view;
    }
}
