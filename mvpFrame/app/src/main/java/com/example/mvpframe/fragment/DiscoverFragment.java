package com.example.mvpframe.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mvpframe.R;
import com.example.mvpframe.util.ToolbarUtils;

/**
 * Created by Riven on 2016/12/22.
 * Email: 1819485687@qq.com
 */
public class DiscoverFragment extends Fragment {

    public static final String TAG = "DiscoverFragment";

    private static DiscoverFragment fragment;

    public static DiscoverFragment newInstance() {
        if (null == fragment) {
            fragment = new DiscoverFragment();
        }
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discover, container, false);
        initTitle(view);
        return view;
    }

    private void initTitle(View view) {
        View header  = view.findViewById(R.id.header_btn_layout);
        ToolbarUtils toolbar = new ToolbarUtils(getActivity(), header);
        toolbar.initTitle("发现");
        toolbar.initMenuClick(ToolbarUtils.NO_ICON, "编辑", null, ToolbarUtils.NO_ICON, "", null);
        TextView tv = (TextView) view.findViewById(R.id.headerMenu2);
        tv.setTextColor(Color.DKGRAY);
    }
}
