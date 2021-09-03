/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiverso;

/**
 *
 * @author Kevin Borge
 */
public class Multiverso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Franquicia fabrica;
       
       fabrica = new Marvel();
       Villano m1 = fabrica.CrearVillano();
       System.out.println(m1);
     
       fabrica = new DC();
       Villano dc1 = fabrica.CrearVillano();
       System.out.println(dc1);
       
       fabrica = new DC();
       Heroe heroedc1 = fabrica.CrearHeroe();
       System.out.println(heroedc1);
       
       fabrica = new Marvel();
       Heroe HMarvel1 = fabrica.CrearHeroe();
       System.out.println(HMarvel1);
       
       fabrica = new Nintendo();
       Villano vNintendo1 = fabrica.CrearVillano();
       System.out.println(vNintendo1);
    }
    
}
