public class OddCubedNumbersSum {
    public static int cubeOdd(int arr[]) {
        int sum = 0;

        for (int i : arr) {
            if(i%2!=0) {
                sum += Math.pow(i, 3);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
            System.out.println(cubeOdd(new int[] {1, 2, 3, 4})); // 28
        }
}
