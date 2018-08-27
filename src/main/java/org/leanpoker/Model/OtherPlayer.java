package org.leanpoker.Model;

public class OtherPlayer {
    Integer id, stack, bet;
    String name, status, version;

    public OtherPlayer(Integer id, Integer stack, Integer bet, String name, String status, String version) {
        this.id = id;
        this.stack = stack;
        this.bet = bet;
        this.name = name;
        this.status = status;
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStack() {
        return stack;
    }

    public void setStack(Integer stack) {
        this.stack = stack;
    }

    public Integer getBet() {
        return bet;
    }

    public void setBet(Integer bet) {
        this.bet = bet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
