//zad1
public static int[] revert(int[] arr) {
        int[] reverted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
        reverted[i] = arr[arr.length - i - 1];
        }
        return reverted;
        }
//zad2
public static String arrayToString(int[] arr) {
        String res = "" + arr[0];
        for (int i = 1; i < arr.length; i++) {
        res += ","+arr[i];
        }
        return res;
        }
//zad3
public static int[] getEven(int[] arr) {
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) countEven++;
        }
        int[] even = new int[countEven];
        int index = 0, counter = 0;
        while (index < arr.length) {
        if (arr[index] % 2 == 0) {
        even[counter] = arr[index];
        counter++;
        }
        index++;
        }
        return even;
        }
//zad4
public static boolean arrayEquals(int[] arr, int[] arr2) {
        if (arr.length != arr2.length) return false;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] != arr2[i]) return false;
        }
        return true;
        }
//zad5
public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        }
//zad6
public static boolean isInArray(double[] arr, double num) {
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == num) return true;
        }
        return false;
        }
//zad7
public static double getAlgebraicMean(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
        }
        return sum /arr.length;
        }
//zad8
public static boolean isIncreasing(int[] arr) {
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
        if (prev > arr[i]) return false;
        prev = arr[i];
        }
        return true;
        }