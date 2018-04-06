package com.example.nano.myapplication.menu;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.nano.myapplication.NavMenuAdapter;
import com.example.nano.myapplication.R;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class TitleViewHolder extends GroupViewHolder {
    private TextView titleView;
    private String titleString;
    private ImageView arrow;
    private ImageView icon;
    NavMenuAdapter adapter;

    public TitleViewHolder(View itemView, NavMenuAdapter adapter) {
        super(itemView);
        icon = (ImageView) itemView.findViewById(R.id.nav_menu_item_icon);
        titleView = (TextView) itemView.findViewById(R.id.nav_menu_item_title);
        arrow = (ImageView) itemView.findViewById(R.id.nav_menu_item_arrow);
        this.adapter = adapter;
    }

    public void setGenreTitle(Context context, ExpandableGroup title) {
        if (title instanceof TitleMenu) {
            if (((TitleMenu) title).getImageResource() != 0){
                Glide.with(context)
                        .load(((TitleMenu) title).getImageResource())
                        .into(icon);
            }

            titleString = title.getTitle();
            titleView.setText(title.getTitle());

            if (title.getItems().size() > 0){
                arrow.setVisibility(View.VISIBLE);

                boolean isExpand = false;
                for (int i = 0; i < adapter.isExpandList.size(); i++) {
                    if (titleString.equals(adapter.isExpandList.get(i))){
                        isExpand = true;
                        break;
                    }
                }
                if (isExpand) {
                    arrow.setImageResource(R.drawable.chevron_up);
                } else {
                    arrow.setImageResource(R.drawable.chevron_down);
                }
            }else{
                arrow.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public void expand() {
        adapter.isExpandList.add(titleString);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void collapse() {
        adapter.isExpandList.remove(titleString);
        adapter.notifyDataSetChanged();
    }
}
