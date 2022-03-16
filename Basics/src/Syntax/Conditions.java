package Syntax;

public class Conditions {
    public static void main(String[] args) {
        int month=11, days;
        switch (month){
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }
        System.out.println("month: "+month+" days: "+days);
    }
}
