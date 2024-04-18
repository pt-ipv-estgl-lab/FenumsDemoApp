// A Java program to demonstrate working on enum
// in switch case (Filename EnumTest.Java)

// An Enum class
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

// Driver class that contains an object of "day" and
// main().

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Test Enum!");

        String str = "MONDAY";

        Day today = Day.valueOf(str);
        
        switch (today) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
            }
    }
}
