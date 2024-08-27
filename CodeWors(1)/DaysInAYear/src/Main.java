public class Main {
    public static void main(String[] args) {
        System.out.println(daysInYear(2000));  
        System.out.println(daysInYear(1974));
        System.out.println(daysInYear(-64));
        System.out.println(daysInYear(0));
    }

    public static String daysInYear(int year) {
        int days;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            days = 366;
        } else {
            days = 365;
        }
        return year + " has " + days + " days";
    }
}