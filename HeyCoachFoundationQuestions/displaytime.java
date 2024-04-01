public class Solution {
    public static void convertSeconds(int seconds) {
        int hr = seconds / 3600;
        seconds %= 3600;
        int min = seconds / 60;
        seconds %= 60;
        int sec = seconds;

        // Ensuring two digits for hours, minutes, and seconds
        String formattedTime = String.format("%02d:%02d:%02d", hr, min, sec);

        System.out.println(formattedTime);
    }

    public static void main(String[] args) {
        // Example usage:
        convertSeconds(3665); // Output: 01:01:05
    }
}
