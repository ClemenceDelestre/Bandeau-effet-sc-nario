
package Effet_et_scenario;

import bandeau.Bandeau ; 

public class EffetRotate extends Effets {
    public EffetRotate (String message, Bandeau bandeau) {
        super(message, bandeau);
        
    }

    @Override
    public void creerUnEffet() {
        monBandeau.setMessage (this.getMessage()); 
        for (int i = 0; i <= 100; i++) {
		monBandeau.setRotation(2*Math.PI*i / 100);
		monBandeau.sleep(100);
	}
    }
    
}
