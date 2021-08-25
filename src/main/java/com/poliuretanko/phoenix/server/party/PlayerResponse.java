package com.poliuretanko.phoenix.server.party;

import com.poliuretanko.phoenix.server.Response;
import com.poliuretanko.phoenix.server.core.Player;

/**
 * @author Denis Gorbatykh
 * @since 8/25/21.
 */
public class PlayerResponse extends Response
{
    private final Player player;
    
    public PlayerResponse( String message, Player player )
    {
        super( message );
        this.player = player;
    }
    
    public Player getPlayer()
    {
        return player;
    }
}
