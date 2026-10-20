class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int andou = 0;
    private int bateria = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.bateria < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.andou;
    }

    public void drive() {
        if (!this.batteryDrained()) {
            this.andou += this.speed;
            this.bateria -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed carro = new NeedForSpeed(50, 4);
        return carro;
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (car.distanceDriven() < distance && !car.batteryDrained()){
            car.drive();
        }

        return car.distanceDriven() >= distance;
    }
}
