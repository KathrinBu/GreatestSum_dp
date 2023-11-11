
/*
Учитывая целочисленный массив nums, верните максимально возможную сумму элементов массива, кратную трем.
Пример 1:
Ввод: nums = [3,6,5,1,8]
 Выход: 18
 Объяснение: Выберите числа 3, 6, 1 и 8, их сумма равна 18 (максимальная сумма делится на 3).
Пример 2:
Ввод: nums = [4]
 Вывод: 0
 Объяснение: Поскольку 4 не делится на 3, не выбирайте никаких чисел.
Пример 3:
Ввод: nums = [1,2,3,4,4]
 Выход: 12
 Объяснение: Выберите числа 1, 3, 4 и 4, их сумма равна 12 (максимальная сумма делится на 3).
 */


public class Main {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,4};
       findSum(nums);
    }

    public static void findSum(int[] nums){
        int[]dp = {0,Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int n:nums) {
            int[]dpNew = new int[3];
            for (int i = 0; i < dpNew.length; i++) {
                dpNew[(i + n) % 3] = Math.max(dp[(i + n) % 3], dp[i] + n);
            }
            dp = dpNew;
        }
        System.out.println(dp[0]);

    }
}
