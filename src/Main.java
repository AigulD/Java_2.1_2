public class Main {
    public static void main(String[] args) {
        long initialBalance = 100;
        long replenishmentAmount = 3000;
        long bonus;
        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }
        long totalBalance = initialBalance + replenishmentAmount + bonus;
        System.out.println(bonus);
        System.out.println(totalBalance);
    }
}
