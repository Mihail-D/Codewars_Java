public class Exclusive_XOR_LogicalOperator {
    public static boolean xor(boolean a, boolean b) {
        boolean bool = false;
        if (a == b && a) {
            bool = false ;
        }
        if (a == b && !a) {
            bool = false;
        }
        if (a != b && a) {
            bool = true;
        }
        if (a != b && !a) {
            bool = true;
        }
        return bool;
    }
}
