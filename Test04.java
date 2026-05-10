public class Test04 {    
    public static void main(String[] args) {
        System.out.println("=== Information about January 26 ===");
        System.out.println("Date: January 26");
        System.out.println("Month: January");
        System.out.println("Day: 26");
        System.out.println("Day of Week: " + getDayOfWeek(2024, 1, 26));
        System.out.println("Historical Significance: Republic Day in India");
        System.out.println("Days remaining in January: " + (31 - 26));
        System.out.println("Days passed in January: " + 26);
    }
    
    static String getDayOfWeek(int year, int month, int day) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int q = day;
        int k = y % 100;
        int j = y / 100;
        int h = (q + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 - 2 * j) % 7;
        int dayIndex = (h + 6) % 7;
        return days[dayIndex];
    }
}
