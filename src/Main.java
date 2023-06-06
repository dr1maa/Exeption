public class Main {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7};
        int[] diffArray = calculateDifference(array1, array2);
        if (diffArray != null) {
            System.out.println("Разница массивов : ");
            for (int i = 0; i < diffArray.length; i++) {
                System.out.println(diffArray[i] + " ");
            }
        }
    }

    public static int[] calculateDifference(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Длинна не совпадает");
            return null;
        }
        int[] diffArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            diffArray[i] = array1[i] - array2[i];
        }
        return diffArray;
    }


    public static void method1() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Исключение : " + e);
        }
    }

    public static void method2() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Исключение : " + e);
        }
    }

    public static void method3() {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение : " + e);
        }
    }


    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}