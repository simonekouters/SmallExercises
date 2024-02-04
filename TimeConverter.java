public class TimeConverter {
    public static void main(String[] args) {
    System.out.println(convertTime(86399));
    }
    
    private static String convertTime(int totalSeconds) {
        int hours = totalSeconds / 3600; 
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        return hours + ":" + minutes + ":" + seconds;
    }
}