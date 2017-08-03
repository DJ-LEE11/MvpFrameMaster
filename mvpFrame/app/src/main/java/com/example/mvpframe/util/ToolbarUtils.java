package com.example.mvpframe.util;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.annotation.StringRes;
import android.support.v4.view.MenuCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.libutil.LogUtils;
import com.example.mvpframe.R;
import com.example.mvpframe.ui.AutoWrapcontentListView;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/**
 * Created by lidongjie on 2017/3/13.
 */

public class ToolbarUtils<V extends View> {
    private Context mContext;
    protected WeakReference<V> mViewReference;
    private Toolbar toolbar;
    private TextView headerMenu1, headerMenu2, headerMenu3;
    public final static int NO_RES = R.id.NO_RES;// 不修改
    public final static int NO_ICON = R.id.NO_ICON;// 不显示
    private List<Map<String, Object>> leftMenus, rightMenus;
    private View rootMenuView;
    private PopupWindow popupMenu;

    public ToolbarUtils(Context context, V view) {
        mContext = context;
        mViewReference = new WeakReference<V>(view);
    }

    /**
     * @param str 标题
     * @Title initTitle
     * @Description 设置标题文字
     * @author jerry
     * @date 2015年7月1日 上午9:39:46
     */
    public void initTitle(String str) {
        try {
            TextView title = (TextView) mViewReference.get().findViewById(R.id.tv_title);
            toolbar = (Toolbar) mViewReference.get().findViewById(R.id.toolbar);
            if (title != null) {
                title.setText(str);
            }
            if (toolbar != null) {
                toolbar.setTitle("");
                ((AppCompatActivity) mContext).setSupportActionBar(toolbar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //头部分割线
    public void initHeaderDivider(boolean hide) {
        try {
            TextView divider = (TextView) mViewReference.get().findViewById(R.id.divider);
            if (divider != null) {
                if (hide) {
                    divider.setVisibility(View.VISIBLE);
                } else {
                    divider.setVisibility(View.GONE);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initBackClick(int resLeft,
                              View.OnClickListener navigationOnClickListener) {
        try {
            headerMenu1 = (TextView) mViewReference.get().findViewById(R.id.headerMenu1);
            toolbar = (Toolbar) mViewReference.get().findViewById(R.id.toolbar);
            if (toolbar != null) {
                if (resLeft == NO_ICON) {
                    ((AppCompatActivity) mContext).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                    ((AppCompatActivity) mContext).getSupportActionBar().setDisplayShowHomeEnabled(false);
                } else {
                    ((AppCompatActivity) mContext).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                    ((AppCompatActivity) mContext).getSupportActionBar().setDisplayShowHomeEnabled(true);
                    if (resLeft != NO_RES) {
                        toolbar.setNavigationIcon(resLeft);
                    } else {
                        //toolbar.setNavigationIcon(R.drawable.ic_action_back);
                    }
                    for (int i = 0; i < toolbar.getChildCount(); i++) {
                        View v = toolbar.getChildAt(i);
                        if (v instanceof ImageView || v instanceof ImageButton) {
                            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) v.getLayoutParams();
                            layoutParams.gravity = Gravity.CENTER_VERTICAL;
                            v.setLayoutParams(layoutParams);
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                //小于21，导致返回键不响应
                                v.setBackgroundResource(R.drawable.selector_menu_bg);
                            }
                        }
                    }
                }
                if (navigationOnClickListener != null) {
                    if (headerMenu1 != null) {
                        headerMenu1.setOnClickListener(navigationOnClickListener);
                    }
                    toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (headerMenu1 != null) {
                                headerMenu1.performClick();
                            }

                        }
                    });
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initMenuClick(int resLeft,
                              @StringRes int textLeftRes, View.OnClickListener left,
                              int resRight, @StringRes int textRightRes, View.OnClickListener right) {
        initMenuClick(resLeft,
                mContext.getString(textLeftRes), left,
                resRight, mContext.getString(textRightRes), right);
    }

    public void initMenuClick(int resLeft,
                              String textLeft, View.OnClickListener left,
                              int resRight, String textRight, View.OnClickListener right) {
        try {
            headerMenu2 = (TextView) mViewReference.get().findViewById(R.id.headerMenu2);
            headerMenu3 = (TextView) mViewReference.get().findViewById(R.id.headerMenu3);
            ActionMenuView actionMenuView = (ActionMenuView) mViewReference.get().findViewById(R.id.action_menu_view);
            if (actionMenuView == null) {
                LogUtils.d("Toolbar为空");
                return;
            }
            actionMenuView.getMenu().clear();
            if (headerMenu2 != null) {
                if (resLeft != NO_ICON || !TextUtils.isEmpty(textLeft)) {//图标或者文字
                    headerMenu2.setText(textLeft + "");
                    MenuItem menuItem = actionMenuView.getMenu().add(100, R.id.headerMenu2, 1, textLeft + "");
                    if (resLeft == NO_RES) {
                        menuItem.setIcon(R.mipmap.ic_setting);
                    } else if (resLeft == NO_ICON) {

                    } else {
                        menuItem.setIcon(resLeft);
                    }
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                        menuItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
                    } else {//小于API11时
                        MenuCompat.setShowAsAction(menuItem, MenuItem.SHOW_AS_ACTION_ALWAYS);
                    }
                    if (left != null && headerMenu2 != null) {
                        headerMenu2.setOnClickListener(left);
                        menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem item) {
                                if (headerMenu2 != null) {
                                    headerMenu2.performClick();
                                }
                                return false;
                            }
                        });
                    }
                }
            }
            if (headerMenu3 != null) {
                if (resRight != NO_ICON || !TextUtils.isEmpty(textRight)) {//图标或者文字
                    headerMenu3.setText(textRight + "");
                    MenuItem menuItem = actionMenuView.getMenu().add(100, R.id.headerMenu3, 2, textRight + "");
                    if (resRight == NO_RES) {
                        menuItem.setIcon(R.mipmap.ic_setting);
                    } else if (resRight == NO_ICON) {

                    } else {
                        menuItem.setIcon(resRight);
                    }
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                        menuItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
                    } else {//小于API11时
                        MenuCompat.setShowAsAction(menuItem, MenuItem.SHOW_AS_ACTION_ALWAYS);
                    }
                    if (right != null && headerMenu3 != null) {
                        headerMenu3.setOnClickListener(right);
                        menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem item) {
                                if (headerMenu3 != null) {
                                    headerMenu3.performClick();
                                }
                                return true;
                            }
                        });
                    }
                }
            }

//            MenuItem menuItem = actionMenuView.getMenu().add(100, R.id.action_pay, 1, "更多").setIcon(resLeft);
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//                menuItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
//            } else {//小于API11时
//                MenuCompat.setShowAsAction(menuItem, MenuItem.SHOW_AS_ACTION_NEVER);
//            }

            for (int i = 0; i < actionMenuView.getChildCount(); i++) {
                ActionMenuItemView v = (ActionMenuItemView) actionMenuView.getChildAt(i);
                v.setBackgroundResource(R.drawable.selector_menu_bg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initMenuWithSubMenuClick(int resLeft,
                                         int textLeftRes,
                                         List<Map<String, Object>> leftMenus,
                                         AdapterView.OnItemClickListener left,
                                         int resRight, int textRightRes, List<Map<String, Object>> rightMenus,
                                         AdapterView.OnItemClickListener right) {
        initMenuWithSubMenuClick(resLeft,
                mContext.getString(textLeftRes), leftMenus, left,
                resRight, mContext.getString(textRightRes), rightMenus, right);
    }

    public void initMenuWithSubMenuClick(int resLeft, String textLeft, final List<Map<String, Object>> leftMenus, final AdapterView.OnItemClickListener left,
                                         int resRight, String textRight, final List<Map<String, Object>> rightMenus, final AdapterView.OnItemClickListener right) {
        try {
            headerMenu2 = (TextView) mViewReference.get().findViewById(R.id.headerMenu2);
            headerMenu3 = (TextView) mViewReference.get().findViewById(R.id.headerMenu3);
            this.leftMenus = leftMenus;
            this.rightMenus = rightMenus;
            ActionMenuView actionMenuView = (ActionMenuView) mViewReference.get().findViewById(R.id.action_menu_view);
            if (actionMenuView == null) {
                LogUtils.d("Toolbar为空");
                return;
            }
            actionMenuView.getMenu().clear();
            if (headerMenu2 != null && resLeft != NO_ICON) {

                headerMenu2.setText(textLeft + "");
                MenuItem menuItem = actionMenuView.getMenu().add(100, R.id.headerMenu2, 1, textLeft + "");
                if (resLeft == NO_RES) {
                    menuItem.setIcon(R.mipmap.ic_setting);
                } else if (resLeft == NO_ICON) {

                } else {
                    menuItem.setIcon(resLeft);
                }
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                    menuItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
                } else {//小于API11时
                    MenuCompat.setShowAsAction(menuItem, MenuItem.SHOW_AS_ACTION_ALWAYS);
                }
                if (leftMenus != null && !leftMenus.isEmpty()) {
                    menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            if (rootMenuView == null || popupMenu == null) {
                                rootMenuView = LayoutInflater.from(mContext)
                                        .inflate(R.layout.popup_actionbar_menu_list, null);
                                // 创建PopupWindow对象
                                popupMenu = new PopupWindow(rootMenuView, ViewGroup.LayoutParams.MATCH_PARENT,
                                        ViewGroup.LayoutParams.MATCH_PARENT);
                                // popupMenu.setAnimationStyle(R.anim.in);
                                popupMenu.setBackgroundDrawable(new BitmapDrawable());// 点击窗口外消失
                                popupMenu.setOutsideTouchable(true);// 以及下一句 同时写才会有效
                                popupMenu.setFocusable(true);// 获取焦点
                                popupMenu.setOnDismissListener(new PopupWindow.OnDismissListener() {
                                    @Override
                                    public void onDismiss() {

                                    }
                                });
                                rootMenuView.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        popupMenu.dismiss();
                                    }
                                });
                            }
                            AutoWrapcontentListView list = (AutoWrapcontentListView) rootMenuView.findViewById(R.id.lvMenu);
                            list.setAnimation(AnimationUtils.loadAnimation(mContext, R.anim.anim_scale_top_right));
                            SimpleAdapter popupMenuListAdapter = new SimpleAdapter(mContext, leftMenus, R.layout.menu_list_item, new String[]{"TITLE"}, new int[]{R.id.tvItemName});
                            list.setAdapter(popupMenuListAdapter);
                            list.setOnItemClickListener(left);
                            popupMenu.showAsDropDown(toolbar.findViewById(R.id.action_menu_view));
                            return true;
                        }
                    });
                }
            }
            if (headerMenu3 != null && resRight != NO_ICON) {
                headerMenu3.setText(textRight + "");
                MenuItem menuItem = actionMenuView.getMenu().add(100, R.id.headerMenu3, 2, textRight + "");
                if (resRight == NO_RES) {
                    menuItem.setIcon(R.mipmap.ic_setting);
                } else if (resRight == NO_ICON) {

                } else {
                    menuItem.setIcon(resRight);
                }
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                    menuItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
                } else {//小于API11时
                    MenuCompat.setShowAsAction(menuItem, MenuItem.SHOW_AS_ACTION_ALWAYS);
                }
                if (rightMenus != null && !rightMenus.isEmpty()) {
                    menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            if (rootMenuView == null || popupMenu == null) {
                                rootMenuView = LayoutInflater.from(mContext)
                                        .inflate(R.layout.popup_actionbar_menu_list, null);
                                // 创建PopupWindow对象
                                popupMenu = new PopupWindow(rootMenuView, ViewGroup.LayoutParams.MATCH_PARENT,
                                        ViewGroup.LayoutParams.MATCH_PARENT);
//                                popupMenu.setWidth(DensityUtil.dp2px(getBaseContext(), 80));
                                // popupMenu.setAnimationStyle(R.anim.in);
//                                popupMenu.setBackgroundDrawable(new BitmapDrawable());// 点击窗口外消失
                                popupMenu.setOutsideTouchable(true);// 以及下一句 同时写才会有效
                                popupMenu.setFocusable(true);// 获取焦点
                                popupMenu.setOnDismissListener(new PopupWindow.OnDismissListener() {
                                    @Override
                                    public void onDismiss() {

                                    }
                                });
                                rootMenuView.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        popupMenu.dismiss();
                                    }
                                });
                            }
                            AutoWrapcontentListView list = (AutoWrapcontentListView) rootMenuView.findViewById(R.id.lvMenu);

                            SimpleAdapter popupMenuListAdapter = new SimpleAdapter(mContext, rightMenus, R.layout.menu_list_item, new String[]{"TITLE"}, new int[]{R.id.tvItemName});
                            list.setAdapter(popupMenuListAdapter);
                            list.setOnItemClickListener(right);
                            popupMenu.showAsDropDown(toolbar.findViewById(R.id.action_menu_view).findViewById(R.id.headerMenu3));
                            return true;
                        }
                    });
                }
            }

//            MenuItem menuItem = actionMenuView.getMenu().add(100, R.id.action_pay, 1, "更多").setIcon(resLeft);
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//                menuItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
//            } else {//小于API11时
//                MenuCompat.setShowAsAction(menuItem, MenuItem.SHOW_AS_ACTION_NEVER);
//            }

            for (int i = 0; i < actionMenuView.getChildCount(); i++) {
                ActionMenuItemView v = (ActionMenuItemView) actionMenuView.getChildAt(i);
                v.setBackgroundResource(R.drawable.selector_menu_bg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭ActionBar菜单
     */
    public void dismissMenu() {
        if (popupMenu != null && popupMenu.isShowing()) {
            popupMenu.dismiss();
        }
    }
}
