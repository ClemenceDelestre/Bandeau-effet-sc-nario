
package Effet_et_scenario;

import bandeau.Bandeau ; 
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

public class EffetBackgroundColorChange extends Effets {
    public EffetBackgroundColorChange (String message, Bandeau bandeau) {
        super (message, bandeau);
    }
   
    @Override
    public void creerUnEffet() {
        monBandeau.setMessage(this.getMessage());
        monBandeau.sleep(1000);
        monBandeau.setBackground (Color.GREEN);
        monBandeau.sleep (1000);
        monBandeau.setBackground (Color.DARK_GRAY); 
        
    }
}
