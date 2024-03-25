package quizes.q2.salim_qassim_1.hip.sub;


public class R21 {
    public static void main(String[] args) {

        int length = 11;
        int height = 12;


        int monthNumber = 45;


        int area = length * height;
        System.out.println("Area of the rectangle: " + area);


        String monthName = getMonthName(monthNumber);
        System.out.println("Name of the month: " + monthName);
    }


    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Month";
        }
    }
}
