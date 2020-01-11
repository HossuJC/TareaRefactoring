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
public class Pelicula {
    
    private String titulo;
    private Produccion produccion;
    private Fecha estreno;
    private Duracion duracion;

    public Pelicula(String titulo, Produccion produccion, Fecha estreno, Duracion duracion) {
        this.titulo = titulo;
        this.produccion = produccion;
        this.estreno = estreno;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Produccion getProduccion() {
        return produccion;
    }

    public void setProduccion(Produccion produccion) {
        this.produccion = produccion;
    }

    public Fecha getEstreno() {
        return estreno;
    }

    public void setEstreno(Fecha estreno) {
        this.estreno = estreno;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public void setDuracion(Duracion duracion) {
        this.duracion = duracion;
    }
    
}
