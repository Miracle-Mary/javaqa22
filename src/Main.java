public class Main {
    public static void main(String[] args) {

        int initBalance = 100;
        int balanceRefill = 1100;
        int balance;
        int bonus = 0;

        if (balanceRefill > 1000) {
            bonus = balanceRefill / 100;
            balanceRefill = balanceRefill + bonus;
        }
        balance = initBalance + balanceRefill;

        System.out.println("Количество бонусных рублей: " + bonus);
        System.out.println("Итоговый счёт: " + balance);
    }
}