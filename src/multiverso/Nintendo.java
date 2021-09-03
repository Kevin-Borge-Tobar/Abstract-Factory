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
public class Nintendo implements Franquicia {

    @Override
    public Heroe CrearHeroe() {
        return new HeroeNintendo();
    }

    @Override
    public Villano CrearVillano() {
        return new VillanoNintendo();
    }
    
}
