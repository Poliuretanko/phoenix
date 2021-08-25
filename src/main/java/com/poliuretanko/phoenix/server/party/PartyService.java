package com.poliuretanko.phoenix.server.party;

import com.poliuretanko.phoenix.server.core.Player;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Denis Gorbatykh
 * @since 8/19/21.
 */
@Service
public class PartyService
{
    private final AtomicLong counter = new AtomicLong( 0 );
    
    final PartyDAO partyDAO;
    
    public PartyService( PartyDAO partyDAO )
    {
        this.partyDAO = partyDAO;
    }
    
    public Player createPlayer( String name )
    {
        Player player = new Player( counter.incrementAndGet(), name );
        partyDAO.addPlayer( player );
        return player;
    }
    
    public Collection<Player> getPlayers()
    {
        return partyDAO.getPlayers();
    }
    
    public Collection<Player> getPlayers( String name )
    {
        return partyDAO.getPlayers( name );
    }
    
    public Player getPlayer( Long id )
    {
        System.out.printf( "Loading player id=%s%n", id );
        return partyDAO.getPlayer( id );
    }
}
