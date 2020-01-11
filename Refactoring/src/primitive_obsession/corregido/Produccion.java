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
public class Produccion {
    
    private String director;
    private String productor;
    private String guionista;

    public Produccion(String director, String productor, String guionista) {
        this.director = director;
        this.productor = productor;
        this.guionista = guionista;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getGuionista() {
        return guionista;
    }

    public void setGuionista(String guionista) {
        this.guionista = guionista;
    }
    
}
