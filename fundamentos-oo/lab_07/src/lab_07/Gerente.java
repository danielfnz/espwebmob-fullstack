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
public class Gerente extends Funcionario{
    
    private double bonificacao;

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    public Gerente(String nome, String sobrenome, double salarioFixo) {
        super(nome, sobrenome, salarioFixo);
    }
    
     public double calculaRenda(){
        return getSalarioFixo() + bonificacao;
    }
              
    @Override
    public void mostraDados() {
        System.out.println("-------------------------------------------------");
          System.out.println("Nome:" + getNome() + " "+ getSobrenome());
        System.out.println("Cargo:" + this.getClass().getSimpleName());
        System.out.println("Salário:" + getSalarioFixo() + bonificacao);
        System.out.println("-------------------------------------------------");
    }
    
}
