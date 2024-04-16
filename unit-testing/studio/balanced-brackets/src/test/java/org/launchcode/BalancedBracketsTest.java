package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void BracketsInStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void BracketsInBeginningReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void EmptyStringValueReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }


    @Test
    public void oneBracketReturnsFalse(){assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));}

    @Test
    public void BracketsInOppositeReturnsFalse(){assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));}

    @Test
    public void OneBracketReturnsFalse(){assertFalse(BalancedBrackets.hasBalancedBrackets("["));}

    @Test
    public void OppositeBracketsReturnsFalse(){assertFalse(BalancedBrackets.hasBalancedBrackets("]["));}
}