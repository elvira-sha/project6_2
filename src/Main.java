public class Main {
    public static void main(String[] args) {
        int initialBalance = 100; // начальная сумма на счету
        int deposit = 1000;       // сумма пополнения
        int bonusThreshold = 1000; // порог для начисления бонусов
        int bonusPerHundred = 1;   // количество бонусных рублей за каждые 100 рублей пополнения

        int bonus; // переменная для хранения бонусов

        // Проверяем, превышает ли сумма пополнения порог
        if (deposit > bonusThreshold) {
            bonus = (deposit / 100) * bonusPerHundred; // Рассчитываем количество бонусов
        } else {
            bonus = 0; // Если порог не превышен или сумма ровно 1000 рублей, бонусов нет
        }

        // Рассчитываем итоговый баланс
        int finalBalance = initialBalance + deposit + bonus;

        // Выводим результат
        System.out.println("Начальная сумма на счету: " + initialBalance + " рублей");
        System.out.println("Сумма пополнения: " + deposit + " рублей");
        System.out.println("Начисленные бонусы: " + bonus + " рублей");
        System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");
    }
}
