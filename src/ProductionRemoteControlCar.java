class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>  {

    int andar = 0;

    @Override
    public void drive() {
        andar += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return andar;
    }

    public int getNumberOfVictories() {
        return this.vitorias;
    }

    private int vitorias = 0;
    public void setNumberOfVictories(int numberOfVictories) {
        this.vitorias = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return  Integer.compare(o.vitorias, this.vitorias);
    }
}
