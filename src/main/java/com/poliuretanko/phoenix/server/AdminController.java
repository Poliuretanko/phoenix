package com.poliuretanko.phoenix.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Denis Gorbatykh
 * @since 8/18/21.
 */
@RestController
public class AdminController
{
    private static final String ok_message = "Server is healthy";
    private final AtomicLong counter = new AtomicLong();
    
    @GetMapping( "/health" )
    public Response health()
    {
        return new Response( ok_message );
    }
}
