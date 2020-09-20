public class Main {
    public static void main(String[] args) {
        long initialBalance = 100;
        long replenishmentAmount = 3000;
        long totalBonus;
        if (replenishmentAmount >= 1000) {
            totalBonus = replenishmentAmount / 100;
        } else {
            totalBonus = 0;
        }
               System.out.println(totalBonus);
    }
}
