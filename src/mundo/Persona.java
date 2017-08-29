/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author root
 */
public class Persona {
    
    private int cedula;
    private int ingresos;
    private int candidato;

    public Persona() {
    }

    public Persona(int cedula, int ingresos, int candidato) {
        this.cedula = cedula;
        this.ingresos = ingresos;
        this.candidato = candidato;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public int getCandidato() {
        return candidato;
    }

    public void setCandidato(int candidato) {
        this.candidato = candidato;
    }
    
    
    
    
}
