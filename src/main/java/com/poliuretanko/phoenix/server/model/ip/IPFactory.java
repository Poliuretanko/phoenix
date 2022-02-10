package com.poliuretanko.phoenix.server.model.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPFactory {
    public final IP createIP(IPDto dto) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName(dto.getIp());
        return new IPImpl(inetAddress);
    }
}
