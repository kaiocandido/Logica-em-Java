class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if(fighter.isVulnerable()== false){
            return 6;
        }
        return 10;
    }
}


class Wizard extends Fighter {
    boolean spell = false;

    public String toString(){
        return "Fighter is a Wizard";
    }

    public void prepareSpell () {
        spell = true;
    }

    @Override
    boolean isVulnerable() {
        if (spell == true){
            return false;
        }
        return true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {

        if(!isVulnerable()){
            return 12;
        }
        return 3;
    }
}