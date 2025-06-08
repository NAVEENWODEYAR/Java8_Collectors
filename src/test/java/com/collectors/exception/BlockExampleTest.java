package com.collectors.exception;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */

public class BlockExampleTest {

 private BlockExample example;

 @BeforeEach
 void setUp() {
     example = new BlockExample();
 }

 @Test
 void testStaticCounter() {
     // Static block should have initialized staticCounter to 100
     assertEquals(100, BlockExample.getStaticCounter(), "Static counter should be initialized to 100");
 }

 @Test
 void testInstanceCounter() {
     // Non-static block should have initialized instanceCounter to 10
     assertEquals(10, example.getInstanceCounter(), "Instance counter should be initialized to 10");
 }
}
