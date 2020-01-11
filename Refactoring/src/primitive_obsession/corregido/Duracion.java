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
public class Duracion {
    
    private int horas;
    private int minutos;
    private int segundos;

    public Duracion(int duracionHoras, int duracionMinutos, int duracionSegundos) {
        this.horas = duracionHoras;
        this.minutos = duracionMinutos;
        this.segundos = duracionSegundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
}
