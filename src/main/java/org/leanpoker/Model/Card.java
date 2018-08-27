package org.leanpoker.Model;

import java.util.ArrayList;
import java.util.List;

public class Card {
    String rank;
    String suit;


    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;

    }

    public Card() {
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

}
