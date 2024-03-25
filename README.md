package quizes.q2.salim_qassim_1.electrochemistry;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250;
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000;


        int tax = 74 * 100;
        int water = 27;
        int gas = 392;
        int electricity = 162 * 100;
        int parking = 69 * 100;

        int totalExpenses = totalCostOfBeans + tax + water + gas + electricity + parking;

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, totalExpenses);
        System.out.println("Profit in Laris: " + profit);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {
        int revenue = pricePerCoffee * numCoffeeSold;
        int totalExpenses = totalCostOfBeans + otherExpenses;
        double profitInTetri = revenue - totalExpenses;

        double profitInLaris = profitInTetri / 100;
        return profitInLaris;
    }
}


