/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Marcelo
 */
public class Usuario {

    private String nome;
    private Date nascimento;
    private Integer cpf;
    private Integer rg;
    private Integer id;
    private String senha;
    private Double peso;
    private Double altura;
    private Double porcMassaGordaCorporal;
    private Double porcMassaMagraCorporal;
    protected ArrayList<Treino> treinos = new ArrayList<>();

    public Usuario(String nome, Date nascimento, int cpf, int rg, String senha) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getId() {
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public ArrayList<Treino> getTreinos() {
        return treinos;
    }
    
    public boolean login(int id, String senha) {
        if (getId() == id && getSenha().equals(senha)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean login(String nome, String senha) {
        if (getNome().equals(nome) && getSenha().equals(senha)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean login(String senha, int cpf) {
        if (getCpf() == cpf && getSenha().equals(senha)) {
            return true;
        } else {
            return false;
        }
    }
    

}