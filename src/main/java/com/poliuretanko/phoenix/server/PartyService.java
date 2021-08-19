package com.poliuretanko.phoenix.server;

import com.poliuretanko.phoenix.server.core.Player;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Denis Gorbatykh
 * @since 8/19/21.
 */
@Service
public class PartyService
{
    private final AtomicLong counter = new AtomicLong( 0 );
    
    public Player createPlayer( String name )
    {
        return new Player( counter.incrementAndGet(), name );
    }
}
