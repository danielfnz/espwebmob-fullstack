/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

/**
 *
 * @author Alunoinf_2
 */
public class Horista extends Funcionario {
    
    private double quantidadeHoras;
    private double valorHora;

    public Horista(double quantidadeHoras, double valorHora, String nome, String sobrenome, double salarioFixo) {
        super(nome, sobrenome, salarioFixo);
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }
      
    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
     public double calculaRenda(){
        return this.quantidadeHoras * this.valorHora;
    }
 
    @Override
    public void mostraDados() {
        System.out.println("-------------------------------------------------");
           System.out.println("Nome:" + getNome() + " "+ getSobrenome());
        System.out.println("Cargo:" + this.getClass().getSimpleName());
        System.out.println("Salário:" + this.quantidadeHoras * this.valorHora);
        System.out.println("-------------------------------------------------");
    }
 
}
