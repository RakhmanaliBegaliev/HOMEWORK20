import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String days1 = sc.nextLine();
    Days days = Days.valueOf(days1.toUpperCase());
    switch (days){
        case MONDAY:
            System.out.println(days);
            break;
        case TUESDAY:
            System.out.println(days);
            break;
        case WEDNESDAY:
            System.out.println(days);
            break;
        case THURSDAY:
            System.out.println(days);
            break;
        case FRIDAY:
            System.out.println(days);
            break;
        case SATURDAY:
            System.out.println(days);
            break;
        case SUNDAY:
            System.out.println(days);
    }
    }
}