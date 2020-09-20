public class Main {
    public static void main(String[] args) {
        long initial_balance = 100;
        long replenishment_amount = 1100;
        long bonus;
        if (replenishment_amount >= 1000) {
            bonus = replenishment_amount / 100;
        } else {
            bonus = 0;
        }
        long total_balance = initial_balance + replenishment_amount + bonus;
        System.out.println(total_balance);
    }
}
