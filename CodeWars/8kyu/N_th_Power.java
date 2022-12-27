public class N_th_Power {
    public static int nthPower(int[] array, int n) {
        return array.length <= n ? -1 : (int) Math.pow(array[n], n);
    }
    
    public static void main(String[] args) {
            System.out.println(nthPower(new int[] {3,1,2,2}, 3));
        }
}
