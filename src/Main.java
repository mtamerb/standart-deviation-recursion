public class Main {
    static double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int n = arr.length;

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("mean :" + main.mean(arr, n));
        System.out.println("varyans :" + main.variance(arr));
        System.out.println("sapma :" + main.standartDeviance());

    }

    double mean(double[] arr, int n) {
        if (n == 1) {
            return arr[n - 1];
        } else {
            return (mean(arr, n - 1) * (n - 1) + arr[n - 1]) / n;
        }
    }

    double variance(double[] arr) {
        double diff = 0;
        for (double v : arr) {
            diff += (v - mean(arr, n)) * (v - mean(arr, n));
        }
        return diff / arr.length;
    }

    double standartDeviance() {
       return Math.sqrt(variance(arr));
    }

}
