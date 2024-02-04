public class SleepIn {
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
    }
    
    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }
}