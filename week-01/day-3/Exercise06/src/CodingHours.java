public class CodingHours {
    public static void main(String[] args) {
        int hoursPerDay = 6;
        int daysPerWeek = 5;
        int weeksPerSemester = 17;
        int spendHoursCodingPerSemester = hoursPerDay * daysPerWeek * weeksPerSemester;
        System.out.println(spendHoursCodingPerSemester);
        int hoursPerWeek = 52;
        System.out.println(spendHoursCodingPerSemester % hoursPerWeek);
    }
}
