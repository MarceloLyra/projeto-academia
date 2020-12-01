/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Funcionario extends Usuario {

    public Funcionario(String nome, Date nascimento, Integer cpf, Integer rg, 
                       String senha, Boolean isFuncionario, String cargo, 
                       Escala Escala, Integer pis) {
        super(nome, nascimento, cpf, rg, senha);
        this.isFuncionario = isFuncionario;
        this.cargo = cargo;
        this.escala = Escala;
        this.pis = pis;
        
    }

    private Boolean isFuncionario;
    private String cargo;
    protected Escala escala;
    private int pis;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Escala getEscala() {
        return escala;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }

    public int getPis() {
        return pis;
    }

    public void setPis(int pis) {
        this.pis = pis;
    }

    public boolean isFuncionario() {
        return isFuncionario;
    }

    public void setFuncionario(boolean isFuncionario) {
        this.isFuncionario = isFuncionario;
    }

    public void setTreinos(ArrayList<Treino> treinos) {
        this.treinos = treinos;
    }

    public Boolean gerarID(Usuario user) {
        Random rd = new Random();
        try {
            user.setIUsuairo(Math.abs(rd.nextInt()));
            return Boolean.TRUE;
        } catch (Exception e) {
            return Boolean.FALSE;
        }

    }

}
