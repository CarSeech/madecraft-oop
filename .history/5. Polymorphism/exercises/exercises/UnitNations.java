package exercises;

import java.util.ArrayList;

public class UnitNations {

    public static void main(String[] args) {
        
        Brazil brazilianObj = new Brazil();
        Trinidad triniObj = new Trinidad ();

        

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(brazilianObj);
        countries.add(triniObj);


        for (Country country : countries) {
            
             country.dance();
        }
    }
}