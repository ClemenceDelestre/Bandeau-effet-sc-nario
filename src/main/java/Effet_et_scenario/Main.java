
package Effet_et_scenario;

import bandeau.Bandeau;

public class Main { 
    public static void main (String[] args) {
        Bandeau monBandeau = new Bandeau() ; 
        Scenario scenario = new Scenario();
        
        EffetRotate rotation = new EffetRotate ("Hello Word", monBandeau); 
        
        EffetBackgroundColorChange couleurFond  = new EffetBackgroundColorChange("This is me", monBandeau); 
        
        EffetClignote clignote = new EffetClignote ("Life should be", monBandeau);
        
        EffetRotate rotation2 = new EffetRotate ("Fun for everyone", monBandeau);
        
        scenario.enchainementEffets (rotation,1);
        scenario.enchainementEffets (couleurFond ,2);
        scenario.enchainementEffets (clignote,5);
        scenario.enchainementEffets (rotation2,1);
        scenario.enchainement();
        
        
    }
    
}
