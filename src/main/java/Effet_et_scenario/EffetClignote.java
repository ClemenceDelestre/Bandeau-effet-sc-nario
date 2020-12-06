
package Effet_et_scenario;

import bandeau.Bandeau;


public class EffetClignote extends Effets {
    private final String message2 = ""; 
    public EffetClignote (String message, Bandeau bandeau){
        super (message, bandeau);
    }

    @Override
    public void creerUnEffet() {
        monBandeau.setMessage(this.getMessage());
        for (int i = 1; i <10; i++) {
            int reste = i % 2; 
            if (reste==0) {
                monBandeau.setMessage(this.getMessage());
                this.getMonBandeau().sleep(100); 
            }
            else {
                monBandeau.setMessage(message2);
                this.getMonBandeau().sleep(100);
            }
	}
    }
    
}
