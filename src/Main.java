public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int accumulation = 2_459_000;
        int sum = 0;
        int quantity = 15_000;
        double percent = (double) 1 / 100;
        int month = 0;
        while (sum < accumulation) {
            sum += quantity;
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("Задание 2");

        int number = 0;
        while (number < 10) {
            number++;
            System.out.println(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.println(number + " ");
        }

        System.out.println("Задание 3");

        int people = 12_000_000;
        int birthratePerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            people += people * birthratePerThousand / 1000 - people * mortalityPerThousand / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }

        System.out.println("Задание 4");

        percent = (double) 7 / 100;
        accumulation = 12_000_000;
        sum = quantity;
        month = 0;
        while (sum < accumulation) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("Задание 5");

        sum = quantity;
        month = 0;
        while (sum < accumulation) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 ==0){
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }

        System.out.println("Задание 6");

        sum = quantity;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }

        System.out.println("Задание 7");

        int friday = 6;
        for (int day = friday; day < 31; day+= 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задание 8");

        int time = 79;
        int startSee = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startSee; year < end; year += time) {
            if(year > start){
                System.out.println(year);
            }
        }
    }
}