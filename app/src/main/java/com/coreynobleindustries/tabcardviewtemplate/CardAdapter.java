package com.coreynobleindustries.tabcardviewtemplate;

/**
 * CardAdapter.java
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
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Java imports
import java.util.ArrayList;

/**
 * CardAdapter
 * Creates CardAdapter for Tab CardView Template
 * Extends: RecyclerView Adapter
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    // Private variables
    private Context cardContext;
    private ArrayList<Card> cardList;

    /**
     * CardViewHolder
     * Creates CardViewHolder for Tab CardView Template
     * Extends: RecyclerView ViewHolder
     */
    public class CardViewHolder extends RecyclerView.ViewHolder {
        public TextView cardText;

        /**
         * CardViewHolder()
         * CardViewHolder explicit constructor
         * @param view
         */
        public CardViewHolder(View view) {
            // Invoke super on view
            super(view);

            // Find cardText
            cardText = (TextView) view.findViewById(R.id.card_text);
        }
    }

    /**
     * CardAdapter()
     * CardAdapter explicit constructor
     * @param cardContext
     * @param cardList
     */
    public CardAdapter(Context cardContext, ArrayList<Card> cardList) {
        this.cardContext = cardContext;
        this.cardList = cardList;
    }

    /**
     * onCreateViewHolder()
     * Initializes CardViewHolder
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new CardViewHolder(view);
    }

    /**
     * onBindViewHolder()
     * Sets current Card
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(final CardViewHolder holder, int position) {
        Card card = cardList.get(position);
        holder.cardText.setText(card.getCardText());
    }

    /**
     * getItemCount()
     * Returns size of cardList
     * @return cardList.size()
     */
    @Override
    public int getItemCount() {
        return cardList.size();
    }
}
