/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author Marcelo
 */
public class Gerente extends Funcionario{

    public Gerente(String nome, Date nascimento, Integer cpf, Integer rg, String senha, Boolean isFuncionario, Double salario, String cargo, Escala Escala, Integer pis) {
        super(nome, nascimento, cpf, rg, senha, isFuncionario, salario, cargo, Escala, pis);
    }
    
    
    
    
    public void alteraSalario(){}
    public void alteraCargo(){}
    
}
