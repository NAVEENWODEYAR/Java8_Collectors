package com.collectors.loops;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */

class LogicalBracketsDemoTest {

    @Test
    void testAllowedEntry_AgeAndID() {
        assertTrue(LogicalBracketsDemo.isAllowedEntry(25, true, false, false));
    }

    @Test
    void testAllowedEntry_VIPAndInvitation() {
        assertTrue(LogicalBracketsDemo.isAllowedEntry(17, false, true, true));
    }

    @Test
    void testAllowedEntry_AllTrue() {
        assertTrue(LogicalBracketsDemo.isAllowedEntry(30, true, true, true));
    }

    @Test
    void testDeniedEntry_UnderageNoVIP() {
        assertFalse(LogicalBracketsDemo.isAllowedEntry(17, false, false, false));
    }

    @Test
    void testDeniedEntry_OnlyVIP() {
        assertFalse(LogicalBracketsDemo.isAllowedEntry(17, false, true, false));
    }

    @Test
    void testDeniedEntry_OnlyInvitation() {
        assertFalse(LogicalBracketsDemo.isAllowedEntry(17, false, false, true));
    }

    @Test
    void testDeniedEntry_UnderageWithID() {
        assertFalse(LogicalBracketsDemo.isAllowedEntry(16, true, false, false));
    }
}

