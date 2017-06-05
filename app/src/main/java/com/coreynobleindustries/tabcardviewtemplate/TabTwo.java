package com.coreynobleindustries.tabcardviewtemplate;

/**
 * TabTwo.java
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
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Java imports
import java.util.ArrayList;

/**
 * TabTwo
 * Creates TabTwo for Tab CardView Template
 * Extends: Fragment
 */
public class TabTwo extends Fragment {

    // Private variables
    private RecyclerView recyclerView;
    private CardAdapter cardAdapter;
    private ArrayList<Card> cardArrayList;

    /**
     * TabTwo()
     * TabTwo constructor
     * Empty, but required
     */
    public TabTwo() {}

    /**
     * onCreateView()
     * Creates view for TabTwo
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return inflated inflater
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate view
        View view = inflater.inflate(R.layout.tab_two, container, false);

        // Find recyclerView
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        // Initialize cardArrayList
        cardArrayList = new ArrayList<>();

        // Initialize cardAdapter
        cardAdapter = new CardAdapter(this.getContext(), cardArrayList);

        // Initialize recyclerView
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this.getContext(), 1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(cardAdapter);

        // Populate cardArrayList with test Cards
        testCards();

        // Return inflated view
        return view;
    }

    /**
     * testCards()
     * Creates test Cards and inserts them into cardArrayList
     */
    private void testCards() {
        for (int i = 0; i < 10; i++) {
            Card card = new Card("Card " + (i + 1));
            cardArrayList.add(card);
        }
    }
}
