public class Main {
    public static void main(String[] args) {
        System.out.println(doOne(10, 7));
        doTwo(-4);
        System.out.println(doThree(3));
        doFour("max",4);
        System.out.println(doFive(400));
    }

    public static boolean doOne(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20)
            return true;
        return false;
    }

    public static void doTwo(int a) {
        if (a >= 0) {
            System.out.println("Передали положительное число");
        } else {
            System.out.println("Передали отрицательное число");
        }
    }

    public static boolean doThree(int a) {
        if (a < 0)
            return true;
            return false;
    }
    public static void doFour(String word, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(word + " ");
        }
    }
    public static boolean doFive(int year){
        if (((year %4 == 0) && (year %100 != 0)) ||( year %400 == 0))
            return true;
        return false;
    }
}