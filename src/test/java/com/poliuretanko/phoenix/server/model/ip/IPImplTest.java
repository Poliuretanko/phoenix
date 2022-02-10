package com.poliuretanko.phoenix.server.model.ip;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.UnknownHostException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class IPImplTest {

    public static Object[][] getIPData() {
        return new Object[][]{
                new Object[]{new IPDto("192.168.0.1"), "192.168.0.1"}
        };
    }

    @ParameterizedTest
    @MethodSource("getIPData")
    public void getIPTest(IPDto dto, String expectedIpString) throws UnknownHostException {
        IP ip = new IPFactory().createIP(dto);
        assertEquals(expectedIpString, ip.getIP());
    }
}
