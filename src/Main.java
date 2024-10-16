public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13676; // стоимость билета
        int milesPerRuble = 20;  // количество рублей для одной бонусной мили

        // Рассчитываем количество бонусных миль
        int bonusMiles = ticketPrice / milesPerRuble;

        // Выводим результат
        System.out.println("Стоимость билета: " + ticketPrice + " рублей");
        System.out.println("Начисленные бонусные мили: " + bonusMiles + " миль");
    }
}
