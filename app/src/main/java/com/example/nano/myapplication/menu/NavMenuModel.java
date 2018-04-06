package com.example.nano.myapplication.menu;

import android.support.v4.app.Fragment;

import com.example.nano.myapplication.fragments.BranchFragment;

import java.util.ArrayList;
import java.util.List;

public class NavMenuModel {

    public String menuTitle;
    public int menuIconDrawable;
    public List<SubMenuModel> subMenu;
    public Fragment fragment;

    public NavMenuModel(String menuTitle, int menuIconDrawable, Fragment fragment) {
        this.menuTitle = menuTitle;
        this.menuIconDrawable = menuIconDrawable;
        this.fragment = fragment;
        this.subMenu = new ArrayList<>();
    }

    public NavMenuModel(String menuTitle, int menuIconDrawable, ArrayList<SubMenuModel> subMenu) {
        this.menuTitle = menuTitle;
        this.menuIconDrawable = menuIconDrawable;
        this.subMenu = new ArrayList<>();
        this.subMenu.addAll(subMenu);
    }

    public static class SubMenuModel {
        public String subMenuTitle;
        public int submenuIconDrawable;
        public Fragment fragment;

        public SubMenuModel(String subMenuTitle,int submenuIconDrawable, Fragment fragment) {
            this.subMenuTitle = subMenuTitle;
            this.submenuIconDrawable=submenuIconDrawable;
            this.fragment = fragment;
        }


    }


}
