/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitive_obsession.corregido;

/**
 *
 * @author Josue Cabezas
 */
public class Fecha {
    
    private int diaEstreno;
    private String mesEstreno;
    private int anioEstreno;

    public Fecha(int diaEstreno, String mesEstreno, int anioEstreno) {
        this.diaEstreno = diaEstreno;
        this.mesEstreno = mesEstreno;
        this.anioEstreno = anioEstreno;
    }

    public int getDiaEstreno() {
        return diaEstreno;
    }

    public void setDiaEstreno(int diaEstreno) {
        this.diaEstreno = diaEstreno;
    }

    public String getMesEstreno() {
        return mesEstreno;
    }

    public void setMesEstreno(String mesEstreno) {
        this.mesEstreno = mesEstreno;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }
    
}
