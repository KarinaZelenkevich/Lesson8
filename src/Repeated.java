public class Repeated {

    public void RepeatedNumbers () {

        int [] nums = {1, 1, 5, 4, 7, 12, 13, 12, 6, 1}; // Вывести число и кол-во раз, сколько это число встречается
        int repeated = 0; // какой элемент
        int a = 0; // сколько раз втсречается
        for ( int i = 0; i < nums.length; i++ ) {
            for (int j = i++; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                  repeated = nums[i];
                  a++;
                }
            }
            System.out.println("Элемент " + repeated + " встречается " +a+ " раз" );
            a = 0;
            break;
        }
    }
}
