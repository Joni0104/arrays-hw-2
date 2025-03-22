public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        int [] pay = {5000 , 10000 , 15000, 20000 , 25000};
        int sum = 0;
        for ( int i = 0 ; i < pay.length ; i++) {
            sum += pay[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();
        System.out.println("Задание 2");
        int min = pay[0];
        int max = pay[0];
        for (int i = 1; i < pay.length; i++) {
            if (pay[i] < min) min = pay[i];
            if (pay[i] > max) max = pay[i];
        }
        System.out.println(
                "Минимальная сумма трат за неделю составила " + min + " рублей. " +
                        "Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println();
        System.out.println("Задание 3");
        double average = (double) sum / pay.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println();
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(new String(reverseFullName));
    }
}