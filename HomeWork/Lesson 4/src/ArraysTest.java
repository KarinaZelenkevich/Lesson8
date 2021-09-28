import java.util.Arrays;

public class ArraysTest {

    public void arraysTest() {
        int[] arrNum = new int[]{1, 12, 8, 4, 7, 10, 55, 46};
        for (int i = 0; i < arrNum.length; i++) {
            Arrays.sort(arrNum);
            System.out.println(arrNum[i]);
        }
        int maxVal = 0;

        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] > maxVal) {
                maxVal = arrNum[i];
            }
        }
        System.out.println("maxValue = " + maxVal);

        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] == '4') {
                System.out.println(arrNum[4]);
                break;
            }
        }
    }
}