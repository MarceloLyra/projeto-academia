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
public class Funcionario extends Usuario {

    public Funcionario(String nome, Date nascimento, int cpf, int rg, String senha) {
        super(nome, nascimento, cpf, rg, senha);
    }

    private Boolean funcionario;
    private Double salario;

    public boolean isFuncionario() {
        return funcionario;
    }

    public void setFuncionario(boolean funcionario) {
        this.funcionario = funcionario;
    }

    public void setTreinos(ArrayList<Treino> treinos) {
        this.treinos = treinos;
    }

    public void gerarID(Usuario user) {
        Random rd = new Random();
        try {
            user.setId(Math.abs(rd.nextInt()));
        } catch (Exception e) {

        }

    }

}
