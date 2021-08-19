package com.poliuretanko.phoenix.server;

import com.poliuretanko.phoenix.server.core.GameObject;

/**
 * @author Denis Gorbatykh
 * @since 8/18/21.
 */
public class Response
{
    private final String message;
    private GameObject object;
    
    public Response( String message )
    {
        this.message = message;
    }
    
    public Response( String message, GameObject object )
    {
        this.message = message;
        this.object = object;
    }
    
    public String getMessage()
    {
        return message;
    }
    
    public GameObject getObject()
    {
        return object;
    }
}
