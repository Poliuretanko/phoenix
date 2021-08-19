package com.poliuretanko.phoenix.server.core;

/**
 * @author Denis Gorbatykh
 * @since 8/19/21.
 */
public class Rule extends GameObject
{
    private final int winThreshold;
    
    public Rule( int winThreshold )
    {
        this.winThreshold = winThreshold;
    }
    
    public boolean triggered( Player player )
    {//todo customizable operand?
        return player.getPoints() >= winThreshold;
    }
}
