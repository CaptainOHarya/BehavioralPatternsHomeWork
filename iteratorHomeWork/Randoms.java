package behavioralpatterns.iteratorHomeWork;

import java.util.Iterator;
import java.util.Random;

/**
 * @author Leonid Zulin
 * @date 03.01.2023 18:16
 */
public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }


    // Internal, auxiliary class for Iterator
    private class RandomIterator implements Iterator<Integer>{

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(max - min + 1) + min;// через java.util.Random.nextInt
            // return (int) (Math.random() * ((max - min) + 1) + min); // через Math.random
        }
    }

}
