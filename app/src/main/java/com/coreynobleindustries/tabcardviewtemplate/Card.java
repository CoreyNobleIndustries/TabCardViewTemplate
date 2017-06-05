package com.coreynobleindustries.tabcardviewtemplate;

/**
 * Card.java
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

/**
 * Card
 * Creates Card object for Tab CardView Template
 */
public class Card {

    // Private variables
    private String cardText;

    /**
     * Card()
     * Card constructor
     * Empty, but required
     */
    public Card() {}

    /**
     * Card()
     * Card explicit constructor
     * Creates Card object with specified text
     * @param cardText
     */
    public Card(String cardText) {
        this.cardText = cardText;
    }

    /**
     * getCardText()
     * cardText accessor
     * Gets Card object's cardText
     * @return cardText
     */
    public String getCardText() {
        return cardText;
    }

    /**
     * setCardText()
     * cardText mutator
     * Sets Card object's cardText
     * @param cardText
     */
    public void setCardText(String cardText) {
        this.cardText = cardText;
    }
}
