/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.enums.DiasSemana;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Marcelo
 */
public class Horario {

    private Integer iHorario;
    private Date horaEntradaExpediente;
    private Date horaSaidaAlmoco;
    private Date horaEntradaAlmoco;
    private Date horaSaidaExpediente;

    public Horario(){}

    public Horario(Date horaEntradaExpediente, Date horaSaidaExpediente) {
        this.horaEntradaExpediente = horaEntradaExpediente;
        this.horaSaidaExpediente = horaSaidaExpediente;
    }
    
    

    public Horario(Integer iHorario, Date horaEntradaExpediente, Date horaSaidaAlmoco, Date horaEntradaAlmoco, Date horaSaidaExpediente) {
        this.iHorario = iHorario;
        this.horaEntradaExpediente = horaEntradaExpediente;
        this.horaSaidaAlmoco = horaSaidaAlmoco;
        this.horaEntradaAlmoco = horaEntradaAlmoco;
        this.horaSaidaExpediente = horaSaidaExpediente;
        
    }

    public Integer getiHorario() {
        return iHorario;
    }

    public void setiHorario(Integer iHorario) {
        this.iHorario = iHorario;
    }
    
    public Date getHoraEntradaExpediente() {
        return horaEntradaExpediente;
    }

    public void setHoraEntradaExpediente(Date horaEntradaExpediente) {
        this.horaEntradaExpediente = horaEntradaExpediente;
    }

    public Date getHoraSaidaAlmoco() {
        return horaSaidaAlmoco;
    }

    public void setHoraSaidaAlmoco(Date horaSaidaAlmoco) {
        this.horaSaidaAlmoco = horaSaidaAlmoco;
    }

    public Date getHoraEntradaAlmoco() {
        return horaEntradaAlmoco;
    }

    public void setHoraEntradaAlmoco(Date horaEntradaAlmoco) {
        this.horaEntradaAlmoco = horaEntradaAlmoco;
    }

    public Date getHoraSaidaExpediente() {
        return horaSaidaExpediente;
    }

    public void setHoraSaidaExpediente(Date horaSaidaExpediente) {
        this.horaSaidaExpediente = horaSaidaExpediente;
    }
    

}
