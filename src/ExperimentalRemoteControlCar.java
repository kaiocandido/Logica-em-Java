public class ExperimentalRemoteControlCar implements RemoteControlCar{
    int andar = 0;

    @Override
    public void drive() {
        andar += 20;
    }

    @Override
    public int getDistanceTravelled() {
        return andar;
    }
}