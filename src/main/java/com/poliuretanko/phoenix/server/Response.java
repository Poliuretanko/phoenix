package com.poliuretanko.phoenix.server;

/**
 * @author Denis Gorbatykh
 * @since 8/18/21.
 */
public class Response
{
    private final String message;
    
    public Response( String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
}
