/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author root
 */
public class Encuesta {

    private ArrayList<Persona> personas;
    private ArrayList<Integer> candidatos;

    public Encuesta() {
        this.candidatos = new ArrayList<>();
        this.personas = new ArrayList<>();
        this.addPersona(new Persona(1093770419, 4000, 1));
        this.addPersona(new Persona(19000, 3000, 2));
        this.addPersona(new Persona(1093770319, 6000, 1));
    }

    public Encuesta(ArrayList<Persona> personas, ArrayList<Integer> candidatos) {
        this.personas = personas;
        this.candidatos = candidatos;
    }

    public int calcularPromedio() {
        int total = 0;
        for (Persona p : this.personas) {
            total += p.getIngresos();
        }
        return total / this.personas.size();
    }

    public int calcularCantidadMayor() {
        int mayor = 0;
        Set<Integer> prueba = new HashSet<Integer>(candidatos);
        for (int x : prueba) {
            if (x > mayor) {
                mayor = x;
            }
        }
        return mayor;
    }

    public String addPersona(Persona p) {
        if (p != null) {
            this.personas.add(p);
            this.candidatos.add(p.getCandidato());
        } else {
            return "Fail";
        }
        return "OK";
    }

}
