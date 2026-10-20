public class Cars_Assemble {
    public double productionRatePerHour(int speed) {
        Double valor = (double) speed * 221;

        if(speed >= 1 && speed <= 4){
            return valor;
        }else if(speed >= 5 && speed <= 8){
            double resultado = valor * 90 / 100.0;
            return resultado;
        }else if(speed == 9){
            double resultado = valor * 80 / 100.0;
            return resultado;
        }else {
            double resultado = valor * 77 / 100.0;
            return resultado;
        }

    }

    public int workingItemsPerMinute(int speed) {
        int valor =  speed * 221;

        if(speed >= 1 && speed <= 4){
            return valor / 60;
        }else if(speed >= 5 && speed <= 8){
            double resultado = (valor * 90 / 100.0) / 60;
            return (int) resultado;
        }else if(speed == 9){
            double resultado = (valor * 80 / 100.0) / 60;
            return (int) resultado;
        }else {
            double resultado = (valor * 77 / 100.0) / 60;
            return (int) resultado;
        }
    }
}