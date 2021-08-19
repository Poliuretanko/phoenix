package com.poliuretanko.phoenix.server.core;

/**
 * @author Denis Gorbatykh
 * @since 8/19/21.
 */
public class Player extends GameObject
{
    private final static int DEFAULT_POINTS = 0;
    private final long id;
    private final String name;
    private int points;
    
    public Player( long id, String name, int points )
    {
        this.id = id;
        this.name = name;
        this.points = points;
    }
    
    public Player( long id, String name )
    {
        this( id, name, DEFAULT_POINTS );
    }
    
    public long getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getPoints()
    {
        return points;
    }
    
    public void setPoints( int points )
    {
        this.points = points;
    }
}
