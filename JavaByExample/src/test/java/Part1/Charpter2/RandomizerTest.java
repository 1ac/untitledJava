package Part1.Charpter2;

import static org.junit.jupiter.api.Assertions.*;

class RandomizerTest {
    public static void main(String[] args) {

        Randomizer r = new Randomizer((int) new java.util.Date().getTime());
        for (int i = 0; i < 10; i++) System.out.println(r.randomInt(100));

    }
}