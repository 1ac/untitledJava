package Part1.Charpter2;

public class Randomizer {
    static final int m = 233280;
    static final int a = 9301;
    static final int c = 49297;

    int seed = 1;

    public Randomizer(int seed) {
        this.seed = seed;
    }

    public float randomFloat() {
        seed = (seed * a + c) % m;
        return (float) Math.abs((float) seed / (float) m);
    }

    public int randomInt(int max) {
        return Math.round(max * randomFloat());
    }
}
