package com.poliuretanko.phoenix.server.core;

import java.util.List;

/**
 * @author Denis Gorbatykh
 * @since 8/19/21.
 */
public class Party extends GameObject
{
    private final Rule winRule;
    private final List<Player> players;
    
    public Party( Rule winRule, List<Player> players )
    {
        this.winRule = winRule;
        this.players = players;
    }
    
    public Rule getWinRule()
    {
        return winRule;
    }
    
    public List<Player> getPlayers()
    {
        return players;
    }
}
