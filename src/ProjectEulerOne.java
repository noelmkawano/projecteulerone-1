/**
 * Created by johnson on 1/4/15.
 */
public class ProjectEulerOne {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i < 1000; i++) {
      if (((i % 3) == 0) || ((i % 5) ==0)) {
        sum += i;
      }
      //System.out.printf("i = %d sum = %d%n", i, sum);
    }
    System.out.println(sum);
  }
}
