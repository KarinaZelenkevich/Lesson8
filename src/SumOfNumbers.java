public class SumOfNumbers {

    public void Numbers () {

        int[] arr = {4, 6, 8, 9, 23}; // за один цикл пробежать, найти минимальный и максимальное знач и вывести их сумму
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
            } max = arr[i];
            if (arr[i]<max) {
                min=arr[i];
            }
        }
        sum = min + max;
        System.out.println(sum);
    }

}
