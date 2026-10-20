import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    private Map<Integer, String> numbers = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return  this.numbers;
    }

    public void setDialingCode(Integer code, String country) {
        if (!this.numbers.containsKey(code)){
            this.numbers.put(code, country);
        }

        this.numbers.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.numbers.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!this.numbers.containsKey(code) && !this.numbers.containsValue(country) ){
            this.numbers.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for(Integer countryId : this.numbers.keySet()){
            if(this.numbers.get(countryId).equals(country)){
                return countryId;
            }
        }

        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer codigo = findDialingCode(country);

        if (codigo != null) {
            this.numbers.remove(codigo);
            this.numbers.put(code, country);
        }
    }

}
