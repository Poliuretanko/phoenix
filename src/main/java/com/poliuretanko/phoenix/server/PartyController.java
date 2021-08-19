package com.poliuretanko.phoenix.server;

import com.poliuretanko.phoenix.server.core.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Denis Gorbatykh
 * @since 8/19/21.
 */
@RestController
public class PartyController
{
    @Autowired
    private final PartyService partyService;
    private final String player_created_message = "Player created";
    
    public PartyController( PartyService partyService )
    {
        this.partyService = partyService;
    }
    
    @PostMapping( "/players" )
    public Response createPlayer( @RequestParam (value = "name") String name )
    {
        Player player = partyService.createPlayer( name );
        return new Response( player_created_message, player );
    }
}
