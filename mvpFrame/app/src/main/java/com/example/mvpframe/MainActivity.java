package com.example.mvpframe;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.librx.mvp.BaseActivity;
import com.example.libutil.IntentUtils;
import com.example.mvpframe.mvp.contract.IHomeContract;
import com.example.mvpframe.mvp.presenter.IHomePresenter;
import com.example.mvpframe.util.ToolbarUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements IHomeContract.View {

    @Bind(R.id.tvInfo)
    TextView mTvInfo;
    @Bind(R.id.etStartPage)
    EditText mEtStartPage;
    @Bind(R.id.etEndPage)
    EditText mEtEndPage;

    private IHomePresenter mIHomePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initTitle();
        mEtStartPage.setText(BuildConfig.start_page);
        mEtEndPage.setText(BuildConfig.end_page);
        new IntentUtils.Builder(this)
                .to(HomeActivity.class)
                .build()
                .start();
    }

    @Override
    protected List createPresenter(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        mIHomePresenter = new IHomePresenter(this);
        list.add(mIHomePresenter);
        return list;
    }

    private void initTitle() {
        View view = findViewById(R.id.header_btn_layout);
        ToolbarUtils toolbar = new ToolbarUtils(this, view);
        toolbar.initTitle("MVP");
    }

    @OnClick(R.id.btnGetInfo)
    public void onGetInfo() {
        mIHomePresenter.getNews();
    }

    @Override
    public String getStartPage() {
        return mEtStartPage.getText().toString();
    }

    @Override
    public String getEndPage() {
        return mEtEndPage.getText().toString();
    }

    @Override
    public void showNews(String newsInfo) {
        mTvInfo.setText(newsInfo);
    }

    @OnClick(R.id.btnOpen)
    public void onOpen() {
        new IntentUtils.Builder(this)
                .to(HomeActivity.class)
                .build()
                .start();
    }
}
