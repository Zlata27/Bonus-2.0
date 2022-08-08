public class Main {

    public static void main(String[] args) {
        int amount = 100; // Начальная сумма счета
        int refill = 1100; // Сумма пополнения счета

        int bonus;
        if (refill > 1000 ) {
            bonus = refill/100;
        } else {
            bonus = 0;
        }

        System.out.println((amount + refill + bonus) + " итоговая сумма на счету");
        System.out.println((bonus) + " сумма бонусов");

    }
}
