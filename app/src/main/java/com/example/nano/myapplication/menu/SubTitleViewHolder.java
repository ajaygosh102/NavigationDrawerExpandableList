package com.example.nano.myapplication.menu;

import android.view.View;
import android.widget.TextView;

import com.example.nano.myapplication.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class SubTitleViewHolder extends ChildViewHolder {
    private TextView subTitleTextView;

    public SubTitleViewHolder(View itemView) {
        super(itemView);
        subTitleTextView = (TextView) itemView.findViewById(R.id.main_nav_submenu_item_title);
    }

    public void setSubTitletName(String name) {
        subTitleTextView.setText(name);
    }
}
