public class _5_Conditional_Statements {
    public static void main(String[] args) {
//        int age = 18;
//        int amount = 100;
//
//        if (age >= 18 && amount >= 120) {
//            System.out.println("you are allowed");
//        } else if (amount < 120) {
//            System.out.println("insufficient balance");
//        } else {
//            System.out.println("you are underage");
//        }

        int day = 4;

//        if (day == 1) {
//            System.out.println("sun");
//        } else if (day == 2) {
//            System.out.println("mon");
//        } else if (day == 3) {
//            System.out.println("tue");
//        } else if (day == 4) {
//            System.out.println("wed");
//        } else if (day == 5) {
//            System.out.println("thurs");
//        } else if (day == 6) {
//            System.out.println("fri");
//        } else if (day == 7) {
//            System.out.println("sat");
//        } else {
//            System.out.println("invalid input");
//        }

//        switch case
//        switch (day){
//            case 1:
//                System.out.println("sun");
//                break;
//            case 2:
//                System.out.println("mon");
//                break;
//            case 3:
//                System.out.println("tue");
//                break;
//            case 4:
//                System.out.println("wed");
//                break;
//            case 5:
//                System.out.println("thurs");
//                break;
//            case 6:
//                System.out.println("fri");
//                break;
//            case 7:
//                System.out.println("sat");
//                break;
//            default:
//                System.out.println("invalid input");
//        }

        int a = 20;
        int b = 20;
        int c = 20;

        if (a > b && a > c) {
            System.out.println("a is greater than b and c");
        } else if (b > a && b > c) {
            System.out.println("b is greater than a and c");
        } else {
            System.out.println("c is greater than a and b");
        }

    }
}
