public class Difference {

    public void DifferenceOfNumbers() {

        int[] array = {4, 5, 2, 12, 4, 6, 8, 34, 10, 26}; // найти разницу между суммой эл-ов стоящих на четных и нечетных местах
        int sumOdd = 0; // сумма нечетных чисел = 28
        int sumEven = 0; // сумма четных = 83
        int dif = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumOdd += array[i];
            } else {
                sumEven += array[i];
            }
            dif = sumEven - sumOdd;
        }
        System.out.println("сумма нечетных : " + sumOdd);
        System.out.println("сумма четных : " + sumEven);
        System.out.println("Разница между суммой четных и нечетных чисел : " + dif);

    }

}

