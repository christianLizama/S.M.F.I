/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Planificacion;

import java.util.ArrayList;

/**
 *
 * @author ckill
 */
public class Agenda extends Formulario{
    
    ArrayList<Formulario> formulario;

    public Agenda(ArrayList<Formulario> formulario) {
        this.formulario = formulario;
    }

    public ArrayList<Formulario> getFormulario() {
        return formulario;
    }

    public void setFormulario(ArrayList<Formulario> formulario) {
        this.formulario = formulario;
    }
    
}
