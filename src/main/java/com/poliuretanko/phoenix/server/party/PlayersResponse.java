package com.poliuretanko.phoenix.server.party;

import com.poliuretanko.phoenix.server.Response;
import com.poliuretanko.phoenix.server.core.Player;

import java.util.Collection;

/**
 * @author Denis Gorbatykh
 * @since 8/25/21.
 */
public class PlayersResponse extends Response
{
    private final Collection<Player> players;
    
    public PlayersResponse( String message, Collection<Player> players )
    {
        super( message );
        this.players = players;
    }
    
    public Collection<Player> getPlayers()
    {
        return players;
    }
}
