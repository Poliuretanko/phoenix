package com.poliuretanko.phoenix.server.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Denis Gorbatykh
 * @since 8/19/21.
 */
public class RuleTest
{
    
    @ParameterizedTest
    @MethodSource( "source_win" )
    public void test_win(int points, int threshold, boolean expectedWin)
    {
        Rule rule = new Rule( threshold );
        Player player = new Player( 1, "", points );
        assertEquals(expectedWin, rule.triggered( player ));
    }
    
    private static Stream<Arguments> source_win()
    {
        return Stream.of(
            Arguments.of( -1, 0, false),
            Arguments.of( 0, 0, true),
            Arguments.of( 1, 0, true)
        );
    }
}
