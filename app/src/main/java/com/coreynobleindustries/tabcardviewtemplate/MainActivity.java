package com.coreynobleindustries.tabcardviewtemplate;

/**
 * MainActivity.java
 *
 * @author Corey J. Noble
 * @date Summer 2017
 * @version 1.0
 *
 * Copyright 2017, Corey Noble Industries. All Rights Reserved.
 *
 * This file is part of Tab CardView Template.
 *
 * Tab CardView Template is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Tab CardView Template is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Tab CardView Template. If not, see <http://www.gnu.org/licenses/>.
 */

// Android imports
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * MainActivity
 * Creates MainActivity for Tab CardView Template
 * Extends: AppCompatActivity
 */
public class MainActivity extends AppCompatActivity {

    /**
     * onCreate()
     * Creates view for MainActivity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ViewPager with a TabAdapter
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new TabAdapter(getSupportFragmentManager()));

        // Initialize TabLayout with ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
