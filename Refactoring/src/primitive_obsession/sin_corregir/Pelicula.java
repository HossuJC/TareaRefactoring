/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitive_obsession.sin_corregir;

/**
 *
 * @author Josue Cabezas
 */
public class Pelicula {

    private String titulo;
    private String director;
    private String productor;
    private String guionista;
    private int duracionHoras;
    private int duracionMinutos;
    private int duracionSegundos;
    private int diaEstreno;
    private String mesEstreno;
    private int anioEstreno;

    public Pelicula(String titulo, String director, String productor, String guionista, int duracionHoras, int duracionMinutos, int duracionSegundos, int diaEstreno, String mesEstreno, int anioEstreno) {
        this.titulo = titulo;
        this.director = director;
        this.productor = productor;
        this.guionista = guionista;
        this.duracionHoras = duracionHoras;
        this.duracionMinutos = duracionMinutos;
        this.duracionSegundos = duracionSegundos;
        this.diaEstreno = diaEstreno;
        this.mesEstreno = mesEstreno;
        this.anioEstreno = anioEstreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
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
