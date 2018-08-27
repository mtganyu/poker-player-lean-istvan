package org.leanpoker.Model;

import java.util.List;

public class GameState {
    String tournamentId, gameId;
    Integer round, betIndex, smallBlind, bigBlind, currentBuyIn;
    Integer pot, minimumRaise, dealer, orbits, inAction;
    List<OtherPlayer> players;
    List<Card> communityCards;

    public GameState(String tournamentId, String gameId, Integer round, Integer betIndex, Integer smallBlind, Integer currentBuyIn, Integer pot, Integer minimumRaise, Integer dealer, Integer orbits, Integer inAction, List<OtherPlayer> players, List<Card> communityCards) {
        this.tournamentId = tournamentId;
        this.gameId = gameId;
        this.round = round;
        this.betIndex = betIndex;
        this.smallBlind = smallBlind;
        this.currentBuyIn = currentBuyIn;
        this.pot = pot;
        this.minimumRaise = minimumRaise;
        this.dealer = dealer;
        this.orbits = orbits;
        this.inAction = inAction;
        this.players = players;
        this.communityCards = communityCards;
        this.bigBlind = smallBlind * 2;
    }

    public GameState() {
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(String tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Integer getBetIndex() {
        return betIndex;
    }

    public void setBetIndex(Integer betIndex) {
        this.betIndex = betIndex;
    }

    public Integer getSmallBlind() {
        return smallBlind;
    }

    public void setSmallBlind(Integer smallBlind) {
        this.smallBlind = smallBlind;
        this.bigBlind = smallBlind * 2;
    }

    public Integer getCurrentBuyIn() {
        return currentBuyIn;
    }

    public void setCurrentBuyIn(Integer currentBuyIn) {
        this.currentBuyIn = currentBuyIn;
    }

    public Integer getPot() {
        return pot;
    }

    public void setPot(Integer pot) {
        this.pot = pot;
    }

    public Integer getMinimumRaise() {
        return minimumRaise;
    }

    public void setMinimumRaise(Integer minimumRaise) {
        this.minimumRaise = minimumRaise;
    }

    public Integer getDealer() {
        return dealer;
    }

    public void setDealer(Integer dealer) {
        this.dealer = dealer;
    }

    public Integer getOrbits() {
        return orbits;
    }

    public void setOrbits(Integer orbits) {
        this.orbits = orbits;
    }

    public Integer getInAction() {
        return inAction;
    }

    public void setInAction(Integer inAction) {
        this.inAction = inAction;
    }

    public List<OtherPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<OtherPlayer> players) {
        this.players = players;
    }

    public List<Card> getCommunityCards() {
        return communityCards;
    }

    public void setCommunityCards(List<Card> communityCards) {
        this.communityCards = communityCards;
    }

    public Integer getBigBlind() {
        return bigBlind;
    }
}
