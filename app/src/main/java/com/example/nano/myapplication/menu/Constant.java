package com.example.nano.myapplication.menu;

import com.example.nano.myapplication.R;
import com.example.nano.myapplication.fragments.StudentFragment;
import com.example.nano.myapplication.fragments.NotificationFragment;
import com.example.nano.myapplication.fragments.BranchFragment;
import com.example.nano.myapplication.fragments.BranchSubFragment;

import java.util.ArrayList;

public class Constant {

    public static ArrayList<NavMenuModel> getMenuNavigasi(){
        ArrayList<NavMenuModel> menu = new ArrayList<>();

        menu.add(new NavMenuModel("Students", R.drawable.school, StudentFragment.newInstance("Students")));

        menu.add(new NavMenuModel("Branch", R.drawable.source_branch,
                new ArrayList<NavMenuModel.SubMenuModel>() {{
                    add(new NavMenuModel.SubMenuModel("ECE",R.drawable.school, BranchFragment.newInstance("ECE")));
                    add(new NavMenuModel.SubMenuModel("CSE",R.drawable.bell_ring, BranchSubFragment.newInstance("CSE")));
                }}));

        menu.add(new NavMenuModel("Notifications", R.drawable.bell_ring, NotificationFragment.newInstance("Notification")));


        return menu;
    }
}
