package org.leanpoker.Model;

import java.util.List;

public class OwnPlayer extends OtherPlayer {

    List<Card> holeCards;

    public OwnPlayer(Integer id, Integer stack, Integer bet, String name, String status, String version, List<Card> holeCards) {
        super(id, stack, bet, name, status, version);
        this.holeCards = holeCards;
    }

    public OwnPlayer() {
    }
}
