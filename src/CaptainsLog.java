import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int sorteado = random.nextInt( PLANET_CLASSES.length);
        return PLANET_CLASSES[sorteado];
    }

    String randomShipRegistryNumber() {
        int number = random.nextInt(1000, 9999 + 1);
        return "NCC-"+number;
    }

    double randomStardate() {
        double number = random.nextDouble(41000.0, 42000.0);
        return number;
    }
}
