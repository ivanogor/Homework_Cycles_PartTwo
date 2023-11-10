public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
        int moneyForSave = 15000;
        int capital = 0;
        int countOfMonths = 0;
        while (capital < 2_459_000) {
            capital = capital + moneyForSave;

            System.out.println("Месяц " + ++countOfMonths + ", сумма накоплений равна " + capital + " рублей");
        }
    }

    public static void task2() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i--;
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        double  population = 12_000_000;
        final double BIRTH_RATE = 0.017;
        final double MORTALITY_RATE = 0.008;
        double countOfBirth;
        double countOfMortality;

        for (int i = 1; i <= 10; i++) {
            countOfBirth = population * BIRTH_RATE;
            countOfMortality = population * MORTALITY_RATE;
            population = population + countOfBirth - countOfMortality;

            System.out.println("Год " + i + " ,численность населения составляет " + population);
        }
    }

    public static void task4() {
        final double CREDIT_RATE = 1.07;
        double  capital = 15_000;
        int countOfMonths = 0;
        capital = capital * CREDIT_RATE;

        while (capital < 12_000_000) {
            capital = capital * CREDIT_RATE;
            countOfMonths++;
            System.out.println(countOfMonths + " месяц. На счете " + capital);
        }
    }

    public static void task5() {
        final double CREDIT_RATE = 1.07;
        double  capital = 15_000;
        int  countOfMonths = 0;


        while (capital < 12_000_000) {
            capital = capital * CREDIT_RATE;
            countOfMonths++;

            switch (countOfMonths) {
                case 6, 12, 18, 24 -> System.out.println(countOfMonths + " месяц. На счете " + capital);
            }
        }
    }

    public static void task6() {
        final double CREDIT_RATE = 1.07;
        double  capital = 15_000;
        int countOfMonths = 9 * 12;

        for (int i = 0; i <= countOfMonths; i++) {
            capital = capital * CREDIT_RATE;

            if (i % 6 == 0 && i > 0) {
                System.out.println(i / 6 + " полгода. Сумма накоплений = " + capital);
            }
        }
    }

    public static void task7() {
        int day = 6;

        while (day <= 31) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            day += 7;
        }
    }

    public static void task8() {
        for (int year = 1823; year <= 2123; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}