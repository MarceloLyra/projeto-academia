/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.enums.DiasSemana;

/**
 *
 * @author Marcelo
 */
public class Escala {
    
    private Integer codEscala;
    private DiasSemana dias;
    private Horario horario;

    public Escala(){}
    
    public Escala(DiasSemana dias, Horario horario) {
        this.dias = dias;
        this.horario = horario;
    }
    
    public Integer getCodEscala() {
        return codEscala;
    }

    public void setCodEscala(Integer codEscala) {
        this.codEscala = codEscala;
    }

    public DiasSemana getDias() {
        return dias;
    }

    public void setDias(DiasSemana dias) {
        this.dias = dias;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    
}
