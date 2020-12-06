/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Effet_et_scenario;
import java.util.LinkedList;
import java.util.List;

 public class Scenario {
     
    public List<Effets> monEnchainement = new LinkedList<>();
    
    public void enchainementEffets (Effets effet, int i ) {
        for (int k=0; k<i ; k++){
            this.monEnchainement.add(effet);
        }
    }
     public void enchainement (){
         for ( Effets e : monEnchainement){
             e.creerUnEffet();
         }
     }
        
        
    }
  
