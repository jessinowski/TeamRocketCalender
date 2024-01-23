public class Calendar {
    public static void main(String[] args) {
        printCalendarForMonth("January");
        printCalendarForMonth("February");
        printCalendarForMonth("March");
        printCalendarForMonth("April");
        printCalendarForMonth("May");
        printCalendarForMonth("June");
        printCalendarForMonth("July");
        printCalendarForMonth("August");
        printCalendarForMonth("September");
        printCalendarForMonth("October");
        printCalendarForMonth("November");
        printCalendarForMonth("December");
    }

    public static void printCalendarForMonth(String monthName){
        System.out.println(monthName);
        System.out.println("Mo Tu We Th Fr Sa Su");
        System.out.println("1   2   3   4   5   6   7");
        System.out.println();
    }
}
