public class Main {
    public static void main(String[] args) {
        int amount = 100; // начальный счет
        int payment = 300; // сумма пополнения
        int bonus;
        bonus = payment / 100;
        if (payment < 1000)
            bonus = 0;
        int total = amount + payment + bonus;

        System.out.println("Сумма на счету: " + total);

    }
}