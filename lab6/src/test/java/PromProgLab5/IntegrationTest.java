package PromProgLab5;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Glory
 */
public class IntegrationTest {
    @Test
    public void testMyJPanelCreation(){
        assertNotNull(new MyJPanel());
    }
}
