package rules;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {
    
    /**
     * Tests the mayUseCodeInAssignment method.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        assertFalse("Expected false: un-cited publicly-available code",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertTrue("Expected true: self-written required code",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }

    // New test 1
    @Test
    public void testUseCodeCitedButNotAvailableToOthers() {
        // Test for code that is cited but not available to others
        assertFalse("Expected false: cited but not available to others",
                RulesOf6005.mayUseCodeInAssignment(false, false, false, true, true));
    }

    // New test 2
    @Test
    public void testUseCodeAvailableButNoCitation() {
        // Test for code available to others but not cited
        assertFalse("Expected false: available to others but not cited",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, true));
    }
}
