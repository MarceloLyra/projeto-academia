/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Marcelo
 */
public class Treino {

    private ArrayList<Exercicio> listaExercicios = new ArrayList<>();
    private String nome;
    private Date inicio;
    private Date fim;
    private String objetivo;

    public Treino() {
    }

    public Treino(String nome, Date inicio) {
        this.nome = nome;
        this.inicio = inicio;
    }

    public Treino(String nome, Date inicio, Date fim, String objetivo) {
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
        this.objetivo = objetivo;
    }

    public ArrayList<Exercicio> getListaExercicios() {
        return listaExercicios;
    }

    public void setListaExercicios(ArrayList<Exercicio> listaExercicios) {
        this.listaExercicios = listaExercicios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

}
