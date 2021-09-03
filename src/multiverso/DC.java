/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiverso;

import multiverso.Franquicia;
import multiverso.Heroe;
import multiverso.HeroeDC;
import multiverso.Villano;
import multiverso.VillanoDC;

/**
 *
 * @author Kevin Borge
 */
public class DC  implements Franquicia{

    @Override
    public Heroe CrearHeroe() {
        return new HeroeDC();
    }

    @Override
    public Villano CrearVillano() {
        return new VillanoDC();
    }
    
}
