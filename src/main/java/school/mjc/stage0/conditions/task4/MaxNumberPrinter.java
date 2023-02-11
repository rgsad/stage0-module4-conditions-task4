package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int x = first > second ? first : second;
        int result = x > third ? x : third;
        System.out.println(result);
    }
}
