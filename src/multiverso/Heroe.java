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
public  abstract class Heroe {

    private  String Tipo;
    private String Nombre;
    private int Danno;
    private int Vida;
    private int defensa;
    
  
    public void  Heroe(){
    
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPoder() {
        return Danno;
    }

    public void setDanno(int Danno) {
        this.Danno = Danno;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

}
