public class Practice {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int hoursPerDay = 6;
        int daysPerWeek = 5;
        int weeksPerSemester = 17;
        int hoursPerSemester = (hoursPerDay * daysPerWeek) * weeksPerSemester;
        System.out.println(hoursPerSemester);
        int HoursPerWeek = 52;

    }
}
