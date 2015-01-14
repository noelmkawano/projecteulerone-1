/**
 * Solves Project Euler problem one.
 */
public class ProjectEulerOne {

  /**
   * Computes sum of multiples up to 1000 and prints out answer.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfMultiples(1000);
    System.out.println(sum);
  }

  /**
   * Computes and returns sum of multiples below upperBound.
   * @param upperBound The upperBound for summation.
   * @return The sum of multiples.
   */
  public static int computeSumOfMultiples(int upperBound) {
    int sum = 0;
    for (int i = 1; i < upperBound; i++) {
      if (((i % 3) == 0) || ((i % 5) == 0)) {
        sum += i;
      }
      //System.out.printf("i = %d sum = %d%n", i, sum);
    }
    return sum;
  }
}
