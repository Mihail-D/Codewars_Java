public class SumOfMultiples {
  public static long sumMul(int n, int m) {
    int sum = 0;

    if (m < 1 || n < 1) {
      throw new IllegalArgumentException();
    }

    for (int i = n;; i = i + n) {
      if (i >= m) {
        break;
      } else {
        sum += i;
      }
    }

    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sumMul(4, -123)); // 2 + 4 + 6 + 8 = 20
  }
}
