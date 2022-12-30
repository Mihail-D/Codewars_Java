public class FIixme_StaticElectrickery {
    private static int ONE_HUNDRED = 100; // Declare this first!

    public static final Dinglemouse INST = new Dinglemouse();

    private int value;

    private void Dinglemouse() {
        value = ONE_HUNDRED;
    }
    public FIixme_StaticElectrickery(int value) {
        this.value = value;
    }

    public int plus100(int n) {
        return value + n;
    }
    private static class Dinglemouse {
    }
}
