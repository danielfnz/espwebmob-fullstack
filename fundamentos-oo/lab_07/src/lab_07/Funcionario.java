/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

import java.util.List;

/**
 *
 * @author Alunoinf_2
 */
public abstract class Funcionario {
    
    private String nome;
    private String sobrenome;
    private double salarioFixo;
    
    private List<Funcionario> pessoas;
    
    public Funcionario(String nome, String sobrenome, double salarioFixo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioFixo = salarioFixo;
    }
    
    public String getNome() {
        return nome;
    }
        
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
           
    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    public abstract double calculaRenda();
    
    public abstract void mostraDados();
        
}
