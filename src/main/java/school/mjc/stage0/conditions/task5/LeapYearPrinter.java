package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public static void isLeapYear(int year) {
        switch(year){
            case 2004:
            case 2000:
                System.out.println("leap");
                break;
            case 1900:
            case 2200:
                System.out.println("not leap");
        }
    }
}
