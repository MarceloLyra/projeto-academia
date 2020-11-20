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
    
    public Gerente(String nome, Date nascimento, int cpf, int rg, String senha) {
        super(nome, nascimento, cpf, rg, senha);
    }
    
    
    public void alteraSalario(){}
    public void alteraCargo(){}
    
}
