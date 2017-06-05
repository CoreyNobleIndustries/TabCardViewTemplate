package com.coreynobleindustries.tabcardviewtemplate;

/**
 * TabAdapter.java
 * @author Corey J. Noble
 * @date Summer 2017
 * @version 1.0
 * Copyright 2017, Corey Noble Industries. All Rights Reserved.
 */

// Android imports
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * TabAdapter
 * Creates TabAdapter for Tab CardView Template
 * Extends: FragmentPagerAdapter
 */
public class TabAdapter extends FragmentPagerAdapter {

    /**
     * TabAdapter()
     * TabAdapter constructor
     * @param fragmentManager
     */
    public TabAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    /**
     * getItem()
     * Get and return desired tab
     * @param position
     * @return desired tab or null
     */
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new TabOne();
            case 1:
                return new TabTwo();
            default:
                return null;
        }
    }

    /**
     * getPageTitle()
     * Get and return desired tab title
     * @param position
     * @return desired tab title or null
     */
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return "Tab 1";
            case 1:
                return "Tab 2";
            default:
                return null;
        }
    }

    /**
     * getCount()
     * Get and return number of tabs
     * @return number of tabs
     */
    public int getCount() {
        return 2;
    }
}
