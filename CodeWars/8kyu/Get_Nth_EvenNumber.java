public class Get_Nth_EvenNumber {
    public static int nthEven(int n) {
        int even = 1;
        for (int i = 0; i < n * 2; i += 2) {
            even = i;
        }
        return even;
    }

    public static void main(String[] args) {
        System.out.println(nthEven(1298734)); // 2597466
        System.out.println(nthEven(100)); // 198
        System.out.println(nthEven(1));
    }
}
