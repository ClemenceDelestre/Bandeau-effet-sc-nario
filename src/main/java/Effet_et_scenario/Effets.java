
package Effet_et_scenario;

import bandeau.Bandeau;


public abstract class Effets {
    private String message ;
    Bandeau monBandeau ; 
    
    public Effets(String message, Bandeau monBandeau) {
        this.message = message ; 
        this.monBandeau = monBandeau;
    }
    public String getMessage() {
        return this.message ; 
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Bandeau getMonBandeau() {
        return monBandeau;
    }

    public void setMonBandeau(Bandeau monBandeau) {
        this.monBandeau = monBandeau;
    }
    
    
    
    public abstract void creerUnEffet () ; 
    
}
 