/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerruptor;

/**
 *
 * @author quique
 */
public class SwitchesA {
    
    int c=1, sw=0, s=0;
    double p = 1;
    
    public void calcularInter(){
  
        while (c<=40){
            if (sw==0){
            
                p=p*c;
                sw = 1;
            } else {
            
                s=s+c;
                sw = 0;
            }
            c+=1;
        }
        
        System.out.println("Suma= "+s+"\nProducto= "+p);
}
} 