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
        System.out.println("Mo\tTu\tWe\tTh\tFr\tSa\tSu");
        System.out.println("1\t2\t3\t4\t5\t6\t7");

        System.out.println();
    }

}
