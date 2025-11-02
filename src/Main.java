import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//задача 1

        int firstFriday = 4;
        for (int i = 1; i <= 31; i++) {
            if ((i - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет.");
            }
        }

//задача 2

//v1
        int dist = 0;
        do {
            dist++;
            if (dist % 500 == 0) {
                System.out.println("Держитесь! Осталось " + (42195 - dist) + " метров.");
            }
        }
        while (dist <= 42195);

//v2
        for (int dist2 = 1; dist2 <= 42195; dist2++) {
            if (dist2 % 500 == 0) {
                System.out.println("Держитесь! Осталось " + (42195 - dist2) + " метров.");
            }
        }

//задача 3

//v1
        int parkingDeposit = 1300;
        int day = 0;
        while (parkingDeposit >= 100) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            parkingDeposit = parkingDeposit - 100;
        }
        System.out.println("автомобиль можно оставить на " + day + " дней");

//v2
        int parkDeposit = 1300;
        int day2 = 1;
        for (; parkDeposit >= 100; day2++) {
            if (day2 % 5 == 0) {
                continue;
            }
            parkDeposit = parkDeposit - 100;
        }
        System.out.println("автомобиль можно оставить на " + (day2 - 1) + " дней");

//задача 4
        int month = 0;
        double total = 0;
        while (true) {
            month++;
            total = total + 15000;
            if (month % 6 == 0) {
                total = total * 1.07;
            }
            String formatTotal = new DecimalFormat("0.00").format(total);
            System.out.println("месяц: " + month + ", сумма на счёте: " + formatTotal);
            if (total >= 12000000) {
                break;
            }
        }

//задача 5

        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                if (overheats == 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд " + charge + "%");
                    break;
                }
                System.out.println("перегрев");
                minute = minute + 2;
                continue;
            }
            charge = charge + 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут");

    }
}