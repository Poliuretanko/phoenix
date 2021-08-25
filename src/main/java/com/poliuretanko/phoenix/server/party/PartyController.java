package com.poliuretanko.phoenix.server.party;

import com.poliuretanko.phoenix.server.Response;
import com.poliuretanko.phoenix.server.core.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author Denis Gorbatykh
 * @since 8/19/21.
 */
@RestController
@RequestMapping(value = "/party", produces = MediaType.APPLICATION_JSON_VALUE)
public class PartyController
{
    @Autowired
    private final PartyService partyService;
    
    public PartyController( PartyService partyService )
    {
        this.partyService = partyService;
    }
    
    @PostMapping( "/players" )
    public Response createPlayer( @RequestParam (value = "name") String name )
    {
        Player player = partyService.createPlayer( name );
        String player_created_message = "Player created";
        return new PlayerResponse( player_created_message, player );
    }
    
    @GetMapping( "/players" )
    public Response getPlayers( @RequestParam (value = "name") String name )
    {
        Collection<Player> players = partyService.getPlayers( name );
        String players_loaded_message = "Players loaded";
        return new PlayersResponse( players_loaded_message, players );
    }
    
    @GetMapping( "/players/{id}" )
    public Response getPlayer( @PathVariable("id") Long id )
    {
        Player player = partyService.getPlayer( id );
        String player_loaded_message = "Player loaded";
        return new PlayerResponse( player_loaded_message, player );
    }
}
