public class SetAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return (employed && !vacation) ? true : false;
    }
}
