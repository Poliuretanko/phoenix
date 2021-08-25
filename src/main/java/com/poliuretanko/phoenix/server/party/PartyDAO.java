package com.poliuretanko.phoenix.server.party;

import com.poliuretanko.phoenix.server.core.Player;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Denis Gorbatykh
 * @since 8/25/21.
 */
@Service
public class PartyDAO
{
    private final Map<Long, Player> players = new HashMap<>();
    
    public Collection<Player> getPlayers()
    {
        return players.values();
    }
    
    public Player getPlayer( Long id )
    {
        return players.get( id );
    }
    
    public Collection<Player> getPlayers( String name )
    {
        return players.values().stream()
            .filter( player -> Objects.equals( player.getName(), name ) )
            .collect( Collectors.toList() );
    }
    
    public void addPlayer( Player player )
    {
        players.put( player.getId(), player );
    }
}
