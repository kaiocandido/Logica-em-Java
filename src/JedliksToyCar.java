public class JedliksToyCar {
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    private int metros = 0;
    public String distanceDisplay() {
        return "Driven " + metros + " meters";
    }

    private int bateria = 100;
    public String batteryDisplay() {
        if(bateria == 0){
            return "Battery empty";
        }
        return "Battery at " + bateria+"%";
    }

    public void drive() {
        if(bateria > 0){
            metros += 20;
            bateria -= 1;
        }
    }
}
