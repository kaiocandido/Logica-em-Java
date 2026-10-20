class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] passaros = {0, 2, 5, 3, 7, 8, 4};
        return passaros;
    }

    public int getToday() {
        int[] passaros = birdsPerDay;
        int tamanhoArray = passaros.length;
        return passaros[tamanhoArray - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < birdsPerDay.length; i++){
            if(birdsPerDay[i] == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int contador = 0;
        for(int i = 0; i < numberOfDays; i++){
            if (i < birdsPerDay.length){
                contador += birdsPerDay[i];
            }
        }
        return contador;
    }

    public int getBusyDays() {
        int valor = 0;

        for(int i = 0; i < birdsPerDay.length; i++){
            if(birdsPerDay[i] >= 5 ){
                valor += 1;
            }
        }
        return valor;
    }
}
