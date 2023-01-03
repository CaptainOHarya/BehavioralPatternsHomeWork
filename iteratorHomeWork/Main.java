package behavioralpatterns.iteratorHomeWork;

/**
 * @author Leonid Zulin
 * @date 03.01.2023 18:14
 */
public class Main {
    public static void main(String[] args) {
        Randoms randoms = new Randoms(90, 100);
        for (int r : randoms) {
            System.out.println("Случайное число = " + r);
            if (r == 100) {
                System.err.println("Выпало число 100, я предлагаю на этом закончить всё!");
                break;
            }

        }
    }
}
