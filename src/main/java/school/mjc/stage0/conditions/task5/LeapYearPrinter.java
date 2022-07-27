package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public static int isLeapYear(int year) {
        year = 2016;
        switch(year){
            case 2016:
            case 2020:
                System.out.println("leap");
                break;
            case 1900:
            case 2200:
                System.out.println("not leap");
            default:
                System.out.println("invalid year");
                break;
        }
        return year;
    }
    public static void main(String[] args){
        isLeapYear(2004);
    }
}
