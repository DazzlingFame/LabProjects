package PromProgLab5;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.PI;

/**@author Glory
 */
public class CircleTest {
    @Test
    public void testArea() {
        Circle circle = new Circle(1d);
        Assert.assertEquals(PI, circle.getArea(), 0.00001);
    }
}
