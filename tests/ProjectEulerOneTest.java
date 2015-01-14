import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the ProjectEulerOne class on small numbers.
 */
public class ProjectEulerOneTest {

  /**
   * Tests sumofmultiples with 10 and 20.
   * @throws Exception If problems occur during computation.
   */
  @Test
  public void testComputeSumOfMultiples() throws Exception {
    assertEquals("test multiples below 10", 23, ProjectEulerOne.computeSumOfMultiples(10));
    assertEquals("test multiples below 20", 78, ProjectEulerOne.computeSumOfMultiples(20));
  }
}