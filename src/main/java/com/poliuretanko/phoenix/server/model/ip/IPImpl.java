package com.poliuretanko.phoenix.server.model.ip;

import java.net.InetAddress;

public class IPImpl implements IP {

    private final InetAddress inetAddress;

    IPImpl(InetAddress inetAddress) {
        this.inetAddress = inetAddress;
    }

    @Override
    public String getIP() {
        return inetAddress.getHostAddress();
    }
}
