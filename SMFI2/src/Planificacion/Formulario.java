/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Planificacion;

import Personas.Estudiante;

/**
 *
 * @author ckill
 */
public class Formulario {
    public int dia; 
    public int mes; 
    public int anno; 
    public String hora; 
    Estudiante paciente;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Estudiante getPaciente() {
        return paciente;
    }

    public void setPaciente(Estudiante paciente) {
        this.paciente = paciente;
    }
    
    
    
}
