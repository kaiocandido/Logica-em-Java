public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

    public int expectedMinutesInOven(){
        int tempo = 40;
        return tempo;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int f){
        int tempo = 40 - f;
        return tempo;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int n){
        int tempo = 2 * n;
        return tempo;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int x, int min){
        int tempo = (x * 2)+ min;
        return tempo;
    }
}