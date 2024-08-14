public class Main {
    public static void main(String[] args) {
        int amount = 500; // начальный счет
        int payment = 1200; // сумма пополнения
        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        if (payment < 1000)
            bonus = 0;
            int total = amount + payment + bonus;

            System.out.println("Сумма на счету: " + total);
        }

    }
}