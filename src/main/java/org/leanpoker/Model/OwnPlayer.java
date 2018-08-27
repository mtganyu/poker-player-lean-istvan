package org.leanpoker.Model;

public class OwnPlayer extends OtherPlayer {

    Card[] holeCards;

    public OwnPlayer(Integer id, Integer stack, Integer bet, String name, String status, String version, Card[] holeCards) {
        super(id, stack, bet, name, status, version);
        this.holeCards = holeCards;
    }
}
